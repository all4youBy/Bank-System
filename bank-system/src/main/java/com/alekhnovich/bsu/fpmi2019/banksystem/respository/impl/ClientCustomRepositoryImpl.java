package com.alekhnovich.bsu.fpmi2019.banksystem.respository.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.PaymentOrder;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.PaymentOrder_;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.ClientCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class ClientCustomRepositoryImpl implements ClientCustomRepository {

    private final EntityManager manager;

    @Autowired
    public ClientCustomRepositoryImpl(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Client> getPayers() {
        CriteriaBuilder cb = manager.getCriteriaBuilder();
        CriteriaQuery<Client> query = cb.createQuery(Client.class);
        Root<PaymentOrder> root = query.from(PaymentOrder.class);
        query.select(root.get(PaymentOrder_.PAYER));
        return  manager.createQuery(query).getResultList();
    }
}
