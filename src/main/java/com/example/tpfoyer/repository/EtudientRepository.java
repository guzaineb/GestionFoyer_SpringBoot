package com.example.tpfoyer.repository;

import com.example.tpfoyer.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudientRepository extends JpaRepository<Etudiant,Long> {
}
