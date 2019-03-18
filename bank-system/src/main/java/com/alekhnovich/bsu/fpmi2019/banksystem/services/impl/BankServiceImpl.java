package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Bank;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.BankRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class BankServiceImpl extends BaseServiceImpl<Bank,Integer> implements BankService {

    private final BankRepository bankRepository;

    @Autowired
    public BankServiceImpl(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public Bank getBankByName(String name) {
        return bankRepository.getBankByBankName(name);
    }

    @Override
    public Bank getBankByAddress(String address) {
        return bankRepository.getBankByAddress(address);
    }

    @Override
    public JpaRepository<Bank, Integer> getRepository() {
        return bankRepository;
    }

}
