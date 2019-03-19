package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.ClientRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public JpaRepository<Client, Integer> getRepository() {
        return clientRepository;
    }

    @Override
    public Client addItem(Client item) {
        return null;
    }

    @Override
    public Client getItem(Integer key) {
        return null;
    }

    @Override
    public List<Client> getItems() {
        return clientRepository.findAll();
    }

    @Override
    @Transactional
    public void deleteClientById(Integer clientId) {
        clientRepository.deleteClientByClientId(clientId);
    }
}
