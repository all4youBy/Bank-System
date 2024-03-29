package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.BankAccountRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.specifications.BankAccountSpecification;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BankAccountServiceImpl extends CrudServiceImpl<BankAccount,Integer> implements BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountServiceImpl(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @Override
    public BankAccount getBankAccountByNumber(String number) {
        return bankAccountRepository.getBankAccountByNumber(number);
    }

    @Override
    public List<BankAccount> getBankAccountsByBankId(Integer bankId) {
        return bankAccountRepository.getBankAccountByBankId(bankId);
    }

    @Override
    public List<BankAccount> getBankAccountsByBankName(String name) {
        return bankAccountRepository.findAll(BankAccountSpecification.bankAccountsByBankName(name));
    }

    @Override
    public JpaRepository<BankAccount, Integer> getRepository() {
        return bankAccountRepository;
    }

}
