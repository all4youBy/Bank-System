package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tax_directory")
@NoArgsConstructor
@RequiredArgsConstructor
public class TaxDirectory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tax_id")
    @Getter
    private Integer taxId;

    @Column(name = "tax_name")
    @Getter
    @Setter
    @NonNull
    private String taxName;
}
