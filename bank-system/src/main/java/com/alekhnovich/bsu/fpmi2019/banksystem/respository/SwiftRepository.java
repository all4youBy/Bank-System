package com.alekhnovich.bsu.fpmi2019.banksystem.respository;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.SwiftDirectory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwiftRepository extends JpaRepository<SwiftDirectory,Integer>{
}
