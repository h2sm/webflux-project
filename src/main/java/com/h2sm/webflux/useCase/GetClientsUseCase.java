package com.h2sm.webflux.useCase;

import com.h2sm.webflux.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetClientsUseCase {
    private final ClientService service;

    public Mono<List<Client>>
}
