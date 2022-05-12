package com.h2sm.webflux.converter.impl;

import com.h2sm.webflux.converter.BaseConverter;
import com.h2sm.webflux.dto.Client;
import com.h2sm.webflux.model.ClientModel;

public class ClientConverter implements BaseConverter<Client, ClientModel> {

    @Override
    public ClientModel entityToModel(Client entity) {
        return ClientModel.builder()
                .;
    }

    @Override
    public Client modelToEntity(ClientModel model) {
        return null;
    }
}
