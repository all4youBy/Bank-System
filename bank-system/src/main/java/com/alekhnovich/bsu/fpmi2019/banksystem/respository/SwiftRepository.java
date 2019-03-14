package com.alekhnovich.bsu.fpmi2019.banksystem.respository;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.SwiftDirectory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwiftRepository extends JpaRepository<SwiftDirectory,Long>{
}
