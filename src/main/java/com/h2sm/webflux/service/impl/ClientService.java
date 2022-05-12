package com.h2sm.webflux.service.impl;

import com.h2sm.webflux.dto.Client;
import com.h2sm.webflux.service.BaseService;
import reactor.core.publisher.Flux;

public class ClientService implements BaseService<Client> {
    @Override
    public Flux<Client> findAll() {
        return null;
    }

    @Override
    public Flux<Client> findByParameter(String param) {
        return null;
    }
}
