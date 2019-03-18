package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "payment_order")
@NoArgsConstructor
@RequiredArgsConstructor
public class PaymentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Setter
    @Getter
    @NonNull
    private String number;

    @Setter
    @Getter
    @NonNull
    private Date date;
}
