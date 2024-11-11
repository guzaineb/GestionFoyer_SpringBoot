package com.example.tpfoyer.repository;

import com.example.tpfoyer.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {

}
