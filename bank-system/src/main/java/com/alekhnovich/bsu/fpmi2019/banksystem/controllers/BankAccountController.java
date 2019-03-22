package com.alekhnovich.bsu.fpmi2019.banksystem.controllers;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.BankAccountRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank_account")
public class BankAccountController {

    private final BankAccountRepository bankAccountRepository;
    private final BankAccountService bankAccountService;

    @Autowired
    public BankAccountController(BankAccountRepository bankAccountRepository, BankAccountService bankAccountService) {
        this.bankAccountRepository = bankAccountRepository;
        this.bankAccountService = bankAccountService;
    }

    @GetMapping
    public ResponseEntity<List<BankAccount>> getAllBankAccounts(){
        return ResponseEntity.ok(bankAccountRepository.findAll());
    }

    @GetMapping("/bank/{bankId}")
    public ResponseEntity<List<BankAccount>> getBankAccountsByBankId(@PathVariable Integer bankId){
        return ResponseEntity.ok(bankAccountService.getBankAccountsByBankId(bankId));
    }

    @GetMapping("/bank/by_name/{bankName}")
    public ResponseEntity<List<BankAccount>> getBankAccountsByBankName(@PathVariable String bankName){
        return ResponseEntity.ok(bankAccountService.getBankAccountsByBankName(bankName));
    }
}
