package com.h2sm.webflux.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BaseService<T> {
    Flux<T> findAll();
    Mono<T> findByParameter(String param);
}
