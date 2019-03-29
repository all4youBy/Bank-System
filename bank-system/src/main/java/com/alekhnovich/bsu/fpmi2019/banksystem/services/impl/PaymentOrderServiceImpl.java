package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.PaymentOrder;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.PaymentOrderRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.PaymentOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentOrderServiceImpl extends CrudServiceImpl<PaymentOrder,Integer> implements PaymentOrderService {

    private final PaymentOrderRepository paymentOrderRepository;

    @Autowired
    public PaymentOrderServiceImpl(PaymentOrderRepository paymentOrderRepository) {
        this.paymentOrderRepository = paymentOrderRepository;
    }

    @Override
    public JpaRepository<PaymentOrder, Integer> getRepository() {
        return paymentOrderRepository;
    }
}
