package com.example.tpfoyer.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private long capaciteFoyer;
    private String nomFoyer;
    //@OneToOne (mappedBy = "foyer")
    //private Universite universite;
    //@OneToMany(mappedBy = "foyer")
    //private Set<Bloc> blocS;




}
