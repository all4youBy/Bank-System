package com.alekhnovich.bsu.fpmi2019.banksystem.services;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Bank;

import java.util.List;

public interface BankService extends BaseService<Bank,Integer> {
    Bank getBankByName(String name);
    Bank getBankByAddress(String address);

}
