package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Reservation;
import com.example.tpfoyer.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ReservationServiceImp implements IReservationService{
    private final LocalContainerEntityManagerFactoryBean entityManagerFactory;
    ReservationRepository reservationRepository;
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }


    public Reservation retrieveReservation(String reservationId) {
        return reservationRepository.findById(reservationId).get();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public void removeReservation(String resId) {
        reservationRepository.deleteById(resId);

    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Scheduled(fixedRate = 50000)
    public void MiseajourDate() {
        List<Reservation> Lr = retrieveAllReservations();
        Calendar c =Calendar.getInstance();
        c. set (Calendar.DATE,1);
        c.set (Calendar .MONTH,1);
        c. set (Calendar.YEAR, 2024);
        Date date=c.getTime();
        for (Reservation r: retrieveAllReservations()){
            if(r. getAnneeUniversitaire().before(date)){
                r. setEstValide(false);
                modifyReservation(r);
                log. info("Reservation modifiee : " + r);

}
        }}}