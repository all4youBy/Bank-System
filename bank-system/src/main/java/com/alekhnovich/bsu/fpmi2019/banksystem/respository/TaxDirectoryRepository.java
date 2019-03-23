package com.alekhnovich.bsu.fpmi2019.banksystem.respository;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.TaxDirectory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxDirectoryRepository extends JpaRepository<TaxDirectory,Integer> {
}
