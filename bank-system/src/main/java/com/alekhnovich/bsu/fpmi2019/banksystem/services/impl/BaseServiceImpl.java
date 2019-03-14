package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.services.BaseService;

import java.util.List;

public abstract class BaseServiceImpl<E,K> implements BaseService<E,K> {

    @Override
    public E addItem(E item) {
        return null;
    }

    @Override
    public E getItem(K key) {
        return null;
    }

    @Override
    public List<E> getItems() {
        return null;
    }
}
