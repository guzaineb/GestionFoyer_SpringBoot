package com.example.tpfoyer.control;

import com.example.tpfoyer.entity.Reservation;
import com.example.tpfoyer.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
public class ReservationRestController {
    IReservationService reservationService;

    //http://localhost:8089/tpfoyer/Reservation/retrieve-all-reservations
@GetMapping("/retrieve-all-reservations")
    public List<Reservation> retrieveAllReservations(){
        List<Reservation> reservations = reservationService.retrieveAllReservations();
        return reservations;
    }
    @GetMapping("/retrieve-chambre/{reservation-Id}")
    public Reservation retrieveReservation(@PathVariable("reservation-Id") String reservationId){
    Reservation reservation = reservationService.retrieveReservation(reservationId);
    return reservation;
    }
    //erreur 500 au niveau de sql
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r){
       Reservation reservation = reservationService.addReservation(r);
       return reservation;
    }
    @DeleteMapping("/delet-reservation/{res-Id}")
    public void removeReservation(@PathVariable("res-Id") String resId) {
     reservationService.removeReservation(resId);

    }
    @PutMapping("/modify-Reservation")
    public Reservation modifyReservation(Reservation reservation){
    Reservation reservation1 = reservationService.modifyReservation(reservation);
    return reservation1;
    }


}
