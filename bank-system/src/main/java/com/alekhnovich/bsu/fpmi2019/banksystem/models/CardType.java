package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "card_type_directory")
@NoArgsConstructor
@RequiredArgsConstructor
public class CardType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeId;

    @Setter
    @Getter
    @NonNull
    private String type;

}
