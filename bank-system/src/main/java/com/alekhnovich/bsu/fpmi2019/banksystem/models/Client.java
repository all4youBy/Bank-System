package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
@NoArgsConstructor
@RequiredArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    @Getter
    @Setter
    private Integer clientId;

    @Setter
    @Getter
    @NonNull
    private String name;

    @OneToMany(mappedBy = "owner",cascade = CascadeType.ALL)
    @Getter
    @Setter
    private Set<UniqueTaxId> taxIds;

    @Setter
    @Getter
    @NonNull
    private String address;

    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    @Getter
    @Setter
    private Set<BankAccount> bankAccounts;
}
