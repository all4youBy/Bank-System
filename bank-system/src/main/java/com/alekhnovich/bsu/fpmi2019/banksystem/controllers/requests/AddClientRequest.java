package com.alekhnovich.bsu.fpmi2019.banksystem.controllers.requests;

import lombok.Data;
import lombok.NonNull;


@Data
public class AddClientRequest {

    @NonNull
    private String name;
    @NonNull
    private String address;
}
