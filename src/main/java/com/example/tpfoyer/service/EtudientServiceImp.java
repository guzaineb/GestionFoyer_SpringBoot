package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Etudiant;
import com.example.tpfoyer.repository.EtudientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class EtudientServiceImp implements IEtudientService {
 EtudientRepository etudientRepository;
    public List<Etudiant> retrieveAllEtudiant() {
        return etudientRepository.findAll();
    }


    public Etudiant retrieveEtudiant(Long EtudiantId) {
        return etudientRepository.findById(EtudiantId).get();
    }


    public Etudiant addEtudiant(Etudiant e) {
        return etudientRepository.save(e);
    }


    public void removeEtudiant(Long EtudiantId) {
         etudientRepository.deleteById(EtudiantId);  }


    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return etudientRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> findAllByDateNaissanceAfterAndEcole(Date dateNaissance, String ecole) {
        return  etudientRepository.findAllByDateNaissanceAfterAndEcoleIsLike(dateNaissance, ecole);
    }

    @Override
    public List<Etudiant> findAllByEcoleAndDateNaissanceAfter(String ecole, Date dateNaissance) {
        return etudientRepository.findAllByEcoleAndDateNaissanceAfter(ecole, dateNaissance);
    }
}
