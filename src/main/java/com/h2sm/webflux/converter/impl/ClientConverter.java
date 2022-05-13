package com.h2sm.webflux.converter.impl;

import com.h2sm.webflux.converter.BaseConverter;
import com.h2sm.webflux.dto.Client;
import com.h2sm.webflux.model.ClientModel;
import org.springframework.stereotype.Component;

@Component
public class ClientConverter implements BaseConverter<Client, ClientModel> {

    @Override
    public ClientModel entityToModel(Client entity) {
        return ClientModel.builder()
                .fullName(entity.getFullName())
                .passport(entity.getPassport())
                .telNumber(entity.getTelNumber())
                .dof(entity.getDof())
                .build();
    }

    @Override
    public Client modelToEntity(ClientModel model) {
        return Client.builder()
                .fullName(model.getFullName())
                .passport(model.getPassport())
                .telNumber(model.getTelNumber())
                .dof(model.getDof())
                .build();
    }
}
