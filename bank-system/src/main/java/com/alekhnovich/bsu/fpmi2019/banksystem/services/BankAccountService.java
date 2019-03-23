package com.alekhnovich.bsu.fpmi2019.banksystem.services;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;

import java.util.List;

public interface BankAccountService extends BaseService<BankAccount,Integer>{

    BankAccount getBankAccountByNumber(String number);
    List<BankAccount> getBankAccountsByBankId(Integer bankId);
    List<BankAccount> getBankAccountsByBankName(String name);
}
