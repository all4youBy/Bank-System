package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "unique_tax_id")
@ToString
@NoArgsConstructor
public class UniqueTaxId {

    @Id
    @Getter
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payer")
    @JsonIgnore
    @Getter
    @Setter
    private Client owner;
}
