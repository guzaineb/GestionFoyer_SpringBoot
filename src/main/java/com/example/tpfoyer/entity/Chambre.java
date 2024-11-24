package com.example.tpfoyer.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// auto incriment au niveau de la base de donnée
    private Long idChambre;

    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @ManyToOne(cascade = CascadeType.ALL)
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Reservation>reservations = new HashSet<Reservation>();


}
