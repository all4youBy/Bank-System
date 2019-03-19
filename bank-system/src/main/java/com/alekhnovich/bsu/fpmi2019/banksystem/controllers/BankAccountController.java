package com.alekhnovich.bsu.fpmi2019.banksystem.controllers;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bank_account")
public class BankAccountController {

    private final BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountController(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @GetMapping
    public ResponseEntity<List<BankAccount>> getAllBankAccounts(){
        return ResponseEntity.ok(bankAccountRepository.findAll());
    }

    @GetMapping("/bank/{bankId}")
    public ResponseEntity<List<BankAccount>> getBankAccountsByBankId(@PathVariable Integer bankId){
        return ResponseEntity.ok(bankAccountRepository.getBankAccountByBankId(bankId));
    }
}
