package com.alekhnovich.bsu.fpmi2019.banksystem.services;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;

public interface BankAccountService extends BaseService<BankAccount,Long>{
    BankAccount getBankAccountByNumber(String number);
}