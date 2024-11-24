package com.example.tpfoyer.entity;

import jakarta.persistence.*;

import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation {


// onetoMany unidirictionnelle il faut maitre une table assossiative (3tables)
    // ManyToONE unidirictionnelle 2 tables
@Id
    private  String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Etudiant>etudiants;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Chambre chambre;




}
