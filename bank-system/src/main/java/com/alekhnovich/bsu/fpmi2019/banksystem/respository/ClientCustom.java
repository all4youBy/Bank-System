package com.alekhnovich.bsu.fpmi2019.banksystem.respository;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;

import java.util.List;

public interface ClientCustom {
    List<Client> getClientsByBankName(String bankName);
}
