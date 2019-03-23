package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "bank_account")
@NoArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    @JsonIgnore
    @Setter
    @Getter
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_type_id")
    @Setter
    @Getter
    private AccountType accountType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_id")
    @Setter
    @Getter
    private Bank bank;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bankAccount")
    @Setter
    @Getter
    private Set<BankCard> bankCards;
}
