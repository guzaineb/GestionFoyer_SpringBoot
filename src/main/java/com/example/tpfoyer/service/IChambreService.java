package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.TypeChambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
    public Chambre addReservationChambre(Chambre chambre);
    public  void ReserverChambre(Long chambreId, String ReservationId);
    public void removeReservationChambre(Long chambreId,String ReservationId );
    public List<Chambre> retrieveAllChambresType();
    public List<Chambre> retrieveAllChambresType(TypeChambre type);

    Chambre TrouverChambreSelonCIN(Long cin);

    List<Chambre> findChambresByEtudiant(Long etudiantId);

}
