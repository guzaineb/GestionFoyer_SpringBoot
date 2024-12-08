package com.example.tpfoyer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    @DateTimeFormat(pattern="yyyy-mm-jj")
    private Date dateNaissance;
     @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL)
     @JsonIgnore
     @ToString.Exclude
    private Set<Reservation>reservations;


}
