package com.example.tpfoyer.repository;

import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.tpfoyer.entity.Etudiant;
import java.util.List;
@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    //Touver tous les chambre qui son de type simple
    List<Chambre>findAllByTypeC(TypeChambre tc);
    //List<Chambre>findByNumeroChambreGreaterThan(Long c);
            //Récupérer tous les chambres qui ont un numéro donnée
    //List<Chambre>findbyNumeroChambre(Long numeroChambre);

    //Récupérer la chambre selon CIN de l'étudiant qui l'occupe
    @Query("SELECT distinct (ch) FROM Chambre ch " +
            "INNER JOIN ch.reservations r " +
            "INNER JOIN r.etudiants e " +
            "WHERE e.cin=:cin ")
    Chambre TrouverChambreSelonCIN(Long cin);


    @Query("SELECT distinct (ch) FROM Chambre ch " +
            "INNER JOIN ch.reservations r "  +"INNER JOIN r.etudiants e "+
            "WHERE e.idEtudiant = :etudiantId AND r.estValide = true")
    List<Chambre> findChambresByEtudiant(Long etudiantId);




}
