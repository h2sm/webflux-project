package com.h2sm.webflux.service;

import reactor.core.publisher.Flux;

public interface BaseService<T> {
    Flux<T> findAll();
    Flux<T> findByParameter(String param); //yikes
}
