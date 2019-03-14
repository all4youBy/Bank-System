package com.alekhnovich.bsu.fpmi2019.banksystem.respository;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,Long>{
    BankAccount getBankAccountByNumber(String number);
}
