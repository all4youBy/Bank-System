package com.alekhnovich.bsu.fpmi2019.banksystem.respository.specifications;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount_;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.Bank_;
import org.springframework.data.jpa.domain.Specification;

public class BankAccountSpecification {

    public static Specification<BankAccount> bankAccountsByBankName(String bankName){
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get(BankAccount_.bank).get(Bank_.bankName),bankName);
    }

}
