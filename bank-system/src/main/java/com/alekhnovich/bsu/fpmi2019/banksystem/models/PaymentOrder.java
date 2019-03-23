package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_status_payment_id")
    @Setter
    @Getter
    private PaymentStatus paymentStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payer")
    @Setter
    @Getter
    private Client payer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "beneficiary")
    @Setter
    @Getter
    private Client beneficiary;

    @Column(name = "third_person_tax_id")
    @Setter
    @Getter
    private String thirdPersonUTI;

    @OneToMany(mappedBy = "paymentOrder",cascade = CascadeType.ALL)
    @Setter
    @Getter
    private Set<Payment> payments;

    @Column(name = "vat_rate")
    @Setter
    @Getter
    private BigDecimal vatRate;

    @Column(name = "vat_sum")
    @Setter
    @Getter
    private BigDecimal vatSum;

    @Column(name = "payment_purpose")
    @Setter
    @Getter
    @NonNull
    private String paymentPurpose;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tax_directory_tax_id")
    @Setter
    @Getter
    private TaxDirectory tax;
}
