package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "bank")
@NoArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bank{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
    @Getter
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
