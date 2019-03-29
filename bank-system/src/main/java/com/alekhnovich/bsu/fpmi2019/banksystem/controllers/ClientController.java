package com.alekhnovich.bsu.fpmi2019.banksystem.controllers;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.dto.ClientDTO;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.dto.ClientId;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.dto.JSONMessage;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.ClientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;
    private final ModelMapper mapper;
    private final ObjectMapper objectMapper;

    @Autowired
    public ClientController(ClientService clientService, ModelMapper mapper, ObjectMapper objectMapper) {
        this.clientService = clientService;
        this.mapper = mapper;
        this.objectMapper = objectMapper;
    }

    @PostMapping
    public ResponseEntity<Object> addClient(@RequestBody Client client){
       Client newClient = clientService.addItem(client);

       return newClient == null?
                            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new JSONMessage("Can't add new client")):
                            ResponseEntity.ok(newClient);

    }

    @GetMapping
    public ResponseEntity<List<Client>> getClients(){
        return ResponseEntity.ok(clientService.getItems());
    }

    @DeleteMapping
    public void deleteClient(@RequestBody ClientId clientId){
        clientService.deleteItemByKey(clientId.getClientId());
    }

    @GetMapping("/ddd/{bankName}")
    public ResponseEntity<List<Client>> getClien(@PathVariable String bankName){
        return ResponseEntity.ok(clientService.getClientsOfBankByName(bankName));
    }

    @GetMapping("/{bankName}")
    public ResponseEntity<List<ClientDTO>> getClientsByBankName(@PathVariable String bankName){
        return  ResponseEntity.ok(clientService.getClientsOfBankByName(bankName)
                .stream()
                .map(client -> mapper.map(client,ClientDTO.class))
                .collect(Collectors.toList()));
    }

    @GetMapping("/payers")
    public ResponseEntity<Object> getPayers(){
        List<Client> payers = clientService.getPayers();

        return payers == null?
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new JSONMessage("Can't get payers.")):
                ResponseEntity.ok(payers);
    }

    @GetMapping("/beneficiary")
    public ResponseEntity<Object> getBeneficiaries(){
       List<Client> beneficiaries = clientService.getBeneficiaries();

       return beneficiaries == null?
               ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new JSONMessage("Can't get beneficiaries.")):
               ResponseEntity.ok(beneficiaries);

    }
}
