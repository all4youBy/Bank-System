package com.alekhnovich.bsu.fpmi2019.banksystem.services;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Bank;

public interface BankService extends BaseService<Bank,Integer> {
    Bank getBankByName(String name);
    Bank getBankByAddress(String address);
}
