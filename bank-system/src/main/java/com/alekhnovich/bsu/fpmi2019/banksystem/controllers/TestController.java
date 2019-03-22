package com.alekhnovich.bsu.fpmi2019.banksystem.controllers;

import com.alekhnovich.bsu.fpmi2019.banksystem.respository.ClientRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.SwiftRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final ClientRepository clientRepository;
    private final SwiftRepository swiftRepository;
    private final ClientService clientService;

    @Autowired
    public TestController(ClientRepository clientRepository, SwiftRepository swiftRepository, ClientService clientService) {
        this.clientRepository = clientRepository;
        this.swiftRepository = swiftRepository;
        this.clientService = clientService;
    }

    @GetMapping("/swift")
    public ResponseEntity<?> getSwiftCodes(){
        return ResponseEntity.ok(swiftRepository.findAll());
    }
}
