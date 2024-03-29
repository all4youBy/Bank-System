package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "bank_card")
@NoArgsConstructor
@RequiredArgsConstructor
public class BankCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    @Getter
    private Integer cardId;

    @Setter
    @Getter
    @NonNull
    private String number;

    @Setter
    @Getter
    @Column(name = "valid_thru")
    private Date validDate;

    @Setter
    @Getter
    @NonNull
    private String owner;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_account_id")
    @Setter
    @Getter
    private BankAccount bankAccount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "directory_type_id")
    @Setter
    @Getter
    private CardType cardType;
}
