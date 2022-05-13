package com.h2sm.webflux.repository;

import com.h2sm.webflux.dto.Client;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface ClientRepository extends R2dbcRepository<Client, Long> {
    Mono<Client> getClientByFullName(String name);
}
