package com.alekhnovich.bsu.fpmi2019.banksystem.respository;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,Integer>,JpaSpecificationExecutor<BankAccount>,
        BankAccountCustom{
    BankAccount getBankAccountByNumber(String number);

    @Query("select ba from BankAccount ba where ba.bank.id=?1")
    List<BankAccount> getBankAccountByBankId(Integer id);
}
