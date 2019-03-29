package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankCard;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.CardRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl extends CrudServiceImpl<BankCard,Integer> implements CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public JpaRepository<BankCard, Integer> getRepository() {
        return cardRepository;
    }
}
