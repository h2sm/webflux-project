package com.h2sm.webflux.controller.impl;

import com.h2sm.webflux.controller.Controller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientController implements Controller {


    @Override
    public Mono<ServerResponse> handle(ServerRequest req) {
        return null;
    }
}
