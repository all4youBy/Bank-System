package com.alekhnovich.bsu.fpmi2019.banksystem.respository.specifications;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import org.springframework.data.jpa.domain.Specification;

public class BankAccountSpecification {

    public static Specification<BankAccount> bankAccountsByBankName(String bankName){
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("bank").get("bankName"),bankName);
    }

}
