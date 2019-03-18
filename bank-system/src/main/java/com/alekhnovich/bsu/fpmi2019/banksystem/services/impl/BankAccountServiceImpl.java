package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.BankAccountRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class BankAccountServiceImpl extends BaseServiceImpl<BankAccount,Integer> implements BankAccountService {

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
    public JpaRepository<BankAccount, Integer> getRepository() {
        return bankAccountRepository;
    }
}
