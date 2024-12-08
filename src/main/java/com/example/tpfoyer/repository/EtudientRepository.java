package com.example.tpfoyer.repository;

import com.example.tpfoyer.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EtudientRepository extends JpaRepository<Etudiant,Long> {
    //Tous les étudients qui ont cin vide
  //  List<Etudiant> findByCinIsNull();

    List<Etudiant> findAllByDateNaissanceAfterAndEcoleIsLike(Date dateNaissance, String ecole);
    List<Etudiant> findAllByEcoleAndDateNaissanceAfter(String ecole, Date dateNaissance);
}
