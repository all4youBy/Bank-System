package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_order_id")
    @JsonIgnore
    @Setter
    @Getter
    private PaymentOrder paymentOrder;

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
