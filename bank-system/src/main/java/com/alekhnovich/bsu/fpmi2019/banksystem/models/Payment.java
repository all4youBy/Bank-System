package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "payment")
@NoArgsConstructor
@RequiredArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Column(name = "payment_date")
    @Setter
    @Getter
    @NonNull
    private Date paymentDate;

    @Setter
    @Getter
    @NonNull
    private BigDecimal sum;

    @Column(name = "transaction_number")
    @Setter
    @Getter
    @NonNull
    private String transactionNumber;
}
