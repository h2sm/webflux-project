package com.h2sm.webflux.converter;

public interface BaseConverter<E, M> {
    M entityToModel(E entity);
    E modelToEntity(M model);
}
