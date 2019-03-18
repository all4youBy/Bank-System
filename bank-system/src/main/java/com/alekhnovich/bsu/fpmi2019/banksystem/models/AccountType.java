package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "account_type")
@NoArgsConstructor
@RequiredArgsConstructor
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_type_id")
    @Getter
    private Integer accountTypeId;

    @Setter
    @Getter
    @NonNull
    private String type;

}
