package com.alekhnovich.bsu.fpmi2019.banksystem.respository;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientRepository extends JpaRepository<Client,Integer>, JpaSpecificationExecutor<Client>,ClientCustomRepository{
    void deleteClientByClientId(Integer clientId);
}
