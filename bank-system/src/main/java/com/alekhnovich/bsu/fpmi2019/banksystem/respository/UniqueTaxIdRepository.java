package com.alekhnovich.bsu.fpmi2019.banksystem.respository;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.UniqueTaxId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniqueTaxIdRepository extends JpaRepository<UniqueTaxId,Integer> {
}
