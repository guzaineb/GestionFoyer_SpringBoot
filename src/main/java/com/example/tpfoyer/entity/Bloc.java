package com.example.tpfoyer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity : auto-incrimente

    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc ;
    @ManyToOne
    @ToString.Exclude
    @JsonIgnore
    private Foyer foyer ;
    @OneToMany ( mappedBy = "bloc", fetch = FetchType.EAGER )
    private Set<Chambre>Chambres;


}
