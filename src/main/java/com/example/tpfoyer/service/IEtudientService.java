package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.Etudiant;

import java.util.List;

public interface IEtudientService {
    public List<Etudiant> retrieveAllEtudiant();
    public Etudiant retrieveEtudiant(Long EtudiantId);
    public Etudiant addEtudiant(Etudiant e);
    public void removeEtudiant(Long EtudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}



