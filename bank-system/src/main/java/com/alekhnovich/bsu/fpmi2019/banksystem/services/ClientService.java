package com.alekhnovich.bsu.fpmi2019.banksystem.services;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;

import java.util.List;

public interface ClientService extends BaseService<Client,Integer>{
    void deleteClientById(Integer clientId);
    List<Client> getClientsOfBankByName(String bankName);
}
