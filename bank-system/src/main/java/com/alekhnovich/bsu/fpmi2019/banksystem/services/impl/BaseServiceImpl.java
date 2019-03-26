package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.exceptions.EntityBeanNotFoundException;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.BaseService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Supplier;

@NoArgsConstructor
public abstract class BaseServiceImpl<E,K> implements BaseService<E,K> {



    @Override
    public E addItem(E item) {
        return getRepository().save(item);
    }

    @Override
    public E getItem(K key) throws EntityBeanNotFoundException {
        return getRepository().findById(key).orElseThrow(()-> new EntityBeanNotFoundException("No bean with such id"));
    }

    @Override
    public List<E> getItems() {
        return getRepository().findAll();
    }
}
