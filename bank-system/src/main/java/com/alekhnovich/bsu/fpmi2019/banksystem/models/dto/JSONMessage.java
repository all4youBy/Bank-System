package com.alekhnovich.bsu.fpmi2019.banksystem.models.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class JSONMessage {
    @NonNull
    private String message;
}
