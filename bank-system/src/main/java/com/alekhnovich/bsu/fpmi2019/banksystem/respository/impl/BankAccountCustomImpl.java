package com.alekhnovich.bsu.fpmi2019.banksystem.respository.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.BankAccountCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class BankAccountCustomImpl implements BankAccountCustom {

    private final EntityManager entityManager;

    @Autowired
    public BankAccountCustomImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<BankAccount> getAllBankAccounts() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<BankAccount> query = cb.createQuery(BankAccount.class);
        Root<BankAccount> root = query.from(BankAccount.class);
        query.select(root);
        TypedQuery<BankAccount> q = entityManager.createQuery(query);
        return q.getResultList();

    }
}
