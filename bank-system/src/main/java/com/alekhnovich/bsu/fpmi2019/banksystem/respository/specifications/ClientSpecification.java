package com.alekhnovich.bsu.fpmi2019.banksystem.respository.specifications;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Bank;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;

public class ClientSpecification {

//    public static Specification<Client> clientsInBank(String bankName){
//        return ((root, criteriaQuery, criteriaBuilder) -> {
//            Join<Client, BankAccount> clientAccounts = root.join("client");
//            Join<Bank,Client>
//        });
//    }

}
