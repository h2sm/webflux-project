package com.h2sm.webflux.service.impl;

import com.h2sm.webflux.dto.Client;
import com.h2sm.webflux.repository.ClientRepository;
import com.h2sm.webflux.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientService implements BaseService<Client> {
    private final ClientRepository repository;
    @Override
    public Flux<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Client> findByParameter(String clientFullName) {
        return repository.getClientByFullName(clientFullName);
    }
}
