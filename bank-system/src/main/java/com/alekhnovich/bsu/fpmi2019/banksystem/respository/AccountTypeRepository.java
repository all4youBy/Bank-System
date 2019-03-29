package com.alekhnovich.bsu.fpmi2019.banksystem.respository;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountTypeRepository extends JpaRepository<AccountType,Integer> {
}
