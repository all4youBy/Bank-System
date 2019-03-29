package com.alekhnovich.bsu.fpmi2019.banksystem.services;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;

import java.util.List;

public interface ClientService extends CrudService<Client,Integer> {
    List<Client> getClientsOfBankByName(String bankName);
    List<Client> getPayers();
    List<Client> getBeneficiaries();
}
