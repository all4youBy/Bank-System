package com.alekhnovich.bsu.fpmi2019.banksystem.models.serializer;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Client;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class ClientJsonSerializer extends JsonSerializer<Client> {

    @Override
    public void serialize(Client client, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
    }
}
