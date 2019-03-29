package com.alekhnovich.bsu.fpmi2019.banksystem.services;

import com.alekhnovich.bsu.fpmi2019.banksystem.exceptions.EntityBeanNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrudService<E,K> {

    JpaRepository<E,K> getRepository();
    E addItem(E item);
    E getItem(K key) throws EntityBeanNotFoundException;
    void deleteItemByKey(K key);
    void deleteItem(E item);
    List<E> getItems();
}
