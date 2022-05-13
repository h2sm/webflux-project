package com.h2sm.webflux.useCase;

import com.h2sm.webflux.converter.impl.ClientConverter;
import com.h2sm.webflux.model.ClientModel;
import com.h2sm.webflux.service.impl.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetClientsUseCase {
    private final ClientService service;
    private final ClientConverter converter;

    public Mono<List<ClientModel>> get() {
        return service.findAll()
                .map(converter::entityToModel)
                .collectList();
    }
}
