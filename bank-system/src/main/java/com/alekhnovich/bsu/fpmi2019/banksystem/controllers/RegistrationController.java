package com.alekhnovich.bsu.fpmi2019.banksystem.controllers;

import com.alekhnovich.bsu.fpmi2019.banksystem.services.BankAccountService;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.ClientService;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.UniqueTaxIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final ClientService clientService;
    private final BankAccountService bankAccountService;
    private final UniqueTaxIdService uniqueTaxIdService;

    @Autowired
    public RegistrationController(ClientService clientService, BankAccountService bankAccountService, UniqueTaxIdService uniqueTaxIdService) {
        this.clientService = clientService;
        this.bankAccountService = bankAccountService;
        this.uniqueTaxIdService = uniqueTaxIdService;
    }


}
