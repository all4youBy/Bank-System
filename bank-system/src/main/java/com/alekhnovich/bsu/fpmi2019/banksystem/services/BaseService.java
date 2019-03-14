package com.alekhnovich.bsu.fpmi2019.banksystem.services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaseService<E,K> {

    JpaRepository<E,K> getRepository();
    E addItem(E item);
    E getItem(K key);
    List<E> getItems();
}
