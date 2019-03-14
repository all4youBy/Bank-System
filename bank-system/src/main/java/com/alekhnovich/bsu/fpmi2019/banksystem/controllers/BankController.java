package com.alekhnovich.bsu.fpmi2019.banksystem.controllers;

import com.alekhnovich.bsu.fpmi2019.banksystem.respository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController{

    private final BankRepository bankRepository;

    @Autowired
    public BankController(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @GetMapping
    public ResponseEntity<?> getBanks(){
        return ResponseEntity.ok(bankRepository.findAll());
    }
}
