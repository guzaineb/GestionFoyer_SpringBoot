package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.Reservation;
import com.example.tpfoyer.entity.TypeChambre;
import com.example.tpfoyer.repository.ChambreRepository;
import com.example.tpfoyer.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpla implements IChambreService {
    ChambreRepository chambreRepository;
    ReservationRepository reservationRepository;
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre addReservationChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void ReserverChambre(Long chambreId, String ReservationId) {
        Chambre chambre = chambreRepository.findById(chambreId).get();
        Reservation reservation = reservationRepository.findById(ReservationId).get();
        chambre.getReservations().add(reservation);
        chambreRepository.save(chambre);

    }

    @Override
    public void removeReservationChambre(Long chambreId, String ReservationId) {
        Chambre chambre = chambreRepository.findById(chambreId).get();
        Reservation reservation = reservationRepository.findById(ReservationId).get();
        chambre.getReservations().remove(reservation);
        chambreRepository.save(chambre);


    }

    @Override
    public List<Chambre> retrieveAllChambresType() {
        return chambreRepository.findAllByTypeC(TypeChambre.TRIPLE);
    }
    public List<Chambre> retrieveAllChambresType(TypeChambre type){
        return chambreRepository.findAllByTypeC(type);
    }

@Override
    public Chambre TrouverChambreSelonCIN(Long cin) {
        return chambreRepository.TrouverChambreSelonCIN(cin);
    }

    @Override
    public List<Chambre> findChambresByEtudiant(Long etudiantId) {
        return chambreRepository.findChambresByEtudiant(etudiantId);
    }

}
