package com.alekhnovich.bsu.fpmi2019.banksystem.models.serializer;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.BankAccount;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;
import com.alekhnovich.bsu.fpmi2019.banksystem.models.UniqueTaxId;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

import java.util.stream.Collectors;

@JsonComponent
public class ClientJsonSerializer extends JsonSerializer<Client> {

    @Override
    public void serialize(Client client, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();

        jsonGenerator.writeStringField("id",client.getClientId().toString());
        jsonGenerator.writeStringField("name",client.getName());

        jsonGenerator.writeFieldName("Tax ids");
        jsonGenerator.writeObject(client.getTaxIds()
                .stream()
                .map(UniqueTaxId::getId)
                .collect(Collectors.toSet()));

        jsonGenerator.writeFieldName("Bank Accounts");
        jsonGenerator.writeObject(client.getBankAccounts()
                .stream()
                .map(BankAccount::getNumber)
                .collect(Collectors.toSet()));

        jsonGenerator.writeEndObject();
    }
}
