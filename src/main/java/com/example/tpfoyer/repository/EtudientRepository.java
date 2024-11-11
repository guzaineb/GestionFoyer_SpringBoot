package com.example.tpfoyer.repository;

import com.example.tpfoyer.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudientRepository extends JpaRepository<Etudiant,Long> {
}
