package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.UniqueTaxId;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.UniqueTaxIdRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.UniqueTaxIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UniqueTaxIdServiceImpl extends BaseServiceImpl<UniqueTaxId,Integer> implements UniqueTaxIdService {

    private final UniqueTaxIdRepository uniqueTaxIdRepository;

    @Autowired
    public UniqueTaxIdServiceImpl(UniqueTaxIdRepository uniqueTaxIdRepository) {
        this.uniqueTaxIdRepository = uniqueTaxIdRepository;
    }

    @Override
    public JpaRepository<UniqueTaxId, Integer> getRepository() {
        return uniqueTaxIdRepository;
    }
}
