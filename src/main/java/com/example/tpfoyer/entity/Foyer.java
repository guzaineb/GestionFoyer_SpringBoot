package com.example.tpfoyer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private long capaciteFoyer;
    private String nomFoyer;
    @OneToOne (mappedBy = "foyer")
    private Universite universite;
    @ToString.Exclude
    @JsonIgnore
    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private Set<Bloc> blocS;




}
