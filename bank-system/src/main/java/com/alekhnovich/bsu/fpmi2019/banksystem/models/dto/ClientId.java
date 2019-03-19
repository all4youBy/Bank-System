package com.alekhnovich.bsu.fpmi2019.banksystem.models.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class ClientId {
    @NonNull
    private Integer clientId;
}
