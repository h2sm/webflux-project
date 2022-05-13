package com.h2sm.webflux.controller.impl;

import com.h2sm.webflux.controller.Controller;
import com.h2sm.webflux.useCase.GetClientsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientController implements Controller {
    private final GetClientsUseCase useCase;

    @Override
    public Mono<ServerResponse> handle(ServerRequest req) {
        return useCase.get()
                .flatMap(list -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(list));
    }
}
