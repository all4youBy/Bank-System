package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "bank_account")
@NoArgsConstructor
@RequiredArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_account_id")
    @Getter
    private Integer bankAccountId;

    @Setter
    @Getter
    @NonNull
    private String number;

    @Setter
    @Getter
    @Column(name = "account_sum")
    @NonNull
    private BigDecimal accountSum;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    @Setter
    @Getter
    @NonNull
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_type_id")
    @Setter
    @Getter
    @NonNull
    private AccountType accountType;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    @Setter
    @Getter
    @NonNull
    private Bank bank;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bankAccount")
    @Setter
    @Getter
    @NonNull
    private Set<BankCard> bankCards;
}
