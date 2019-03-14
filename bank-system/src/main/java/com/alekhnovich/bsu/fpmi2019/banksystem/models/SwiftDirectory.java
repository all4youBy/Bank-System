package com.alekhnovich.bsu.fpmi2019.banksystem.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "swift_directory")
@NoArgsConstructor
@RequiredArgsConstructor
public class SwiftDirectory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Column(name = "swift_code")
    @Getter
    @Setter
    @NonNull
    private String swiftCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_bank_id")
    @Setter
    @Getter
    @NonNull
    private Bank bank;
}
