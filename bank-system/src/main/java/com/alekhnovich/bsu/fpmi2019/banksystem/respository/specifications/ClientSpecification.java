package com.alekhnovich.bsu.fpmi2019.banksystem.respository.specifications;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.*;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;

public class ClientSpecification {

    public static Specification<Client> clientsInBank(String bankName){
        return (root, criteriaQuery, criteriaBuilder) -> {
            Join<Client,BankAccount> clientAccounts = root.join(Client_.bankAccounts);
            Join<BankAccount,Bank> clientInBank = clientAccounts.join(BankAccount_.bank);
            criteriaQuery.distinct(true);
            return criteriaBuilder.equal(clientInBank.get(Bank_.bankName),bankName);
        };
    }

}
