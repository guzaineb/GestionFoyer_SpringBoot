package com.example.tpfoyer.repository;

import com.example.tpfoyer.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
    List<Reservation> findByAnneeUniversitaire(LocalDate dateLimite);
}
