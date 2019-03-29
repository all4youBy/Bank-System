package com.alekhnovich.bsu.fpmi2019.banksystem.services.impl;

import com.alekhnovich.bsu.fpmi2019.banksystem.models.Payment;
import com.alekhnovich.bsu.fpmi2019.banksystem.respository.PaymentRepository;
import com.alekhnovich.bsu.fpmi2019.banksystem.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends CrudServiceImpl<Payment,Integer> implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public JpaRepository<Payment, Integer> getRepository() {
        return paymentRepository;
    }
}
