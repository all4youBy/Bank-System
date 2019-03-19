package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.services.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class BaseServiceImpl<E,K> implements BaseService<E,K> {

    @Override
    public E addItem(E item) {
        return getRepository().save(item);
    }

    @Override
    public E getItem(K key) {
        return getRepository().findById(key).orElse(null);
    }

    @Override
    public List<E> getItems() {
        return getRepository().findAll();
    }
}
