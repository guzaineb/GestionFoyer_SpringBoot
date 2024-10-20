package com.example.tpfoyer.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {


// onetoMany unidirictionnelle il faut maitre une table assossiative (3tables)
    // ManyToONE unidirictionnelle 2 tables
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    //@ManyToMany
    //private Set<Etudiant>etudiants;




}
