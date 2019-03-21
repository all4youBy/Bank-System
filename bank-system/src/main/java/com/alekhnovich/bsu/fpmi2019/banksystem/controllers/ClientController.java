package com.alekhnovich.bsu.fpmi2019.banksystem.controllers;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.dto.ClientDTO;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.dto.ClientId;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ClientController {

    private final ClientService clientService;
    private final ModelMapper mapper;

    @Autowired
    public ClientController(ClientService clientService, ModelMapper mapper) {
        this.clientService = clientService;
        this.mapper = mapper;
    }

    @GetMapping("/clients")
    public ResponseEntity<List<Client>> getClients(){
        return ResponseEntity.ok(clientService.getItems());
    }

    @DeleteMapping("/clients")
    public void deleteClient(@RequestBody ClientId clientId){
        clientService.deleteClientById(clientId.getClientId());
    }

    @GetMapping("/clients/{bankName}")
    public ResponseEntity<List<ClientDTO>> getClientsByBankName(@PathVariable String bankName){
        return  ResponseEntity.ok(clientService.getClientsOfBankByName(bankName)
                .stream()
                .map(client -> mapper.map(client,ClientDTO.class))
                .collect(Collectors.toList()));
    }
}
