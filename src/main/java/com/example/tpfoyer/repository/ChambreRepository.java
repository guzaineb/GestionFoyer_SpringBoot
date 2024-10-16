package com.example.tpfoyer.repository;

import com.example.tpfoyer.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

}
