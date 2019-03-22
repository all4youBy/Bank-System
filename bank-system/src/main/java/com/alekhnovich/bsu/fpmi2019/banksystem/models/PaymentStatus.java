package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "payment_status")
@NoArgsConstructor
@RequiredArgsConstructor
public class PaymentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    @Getter
    private Integer paymentId;

    @Setter
    @Getter
    @NonNull
    private String status;
}
