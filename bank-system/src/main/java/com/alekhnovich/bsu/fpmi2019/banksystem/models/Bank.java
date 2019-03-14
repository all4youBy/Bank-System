package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "bank")
@NoArgsConstructor
@RequiredArgsConstructor
public class Bank{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
    @Getter
    @Setter
    private Integer id;

    @Column(name = "name")
    @Setter
    @Getter
    @NonNull
    private String bankName;

    @Setter
    @Getter
    @NonNull
    private String address;
}
