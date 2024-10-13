package com.example.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity : auto-incrimente

    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
    @ManyToOne
    private Foyer foyer ;
    @OneToMany ( mappedBy = "bloc")
    private Set<Chambre>Chambres;


}
