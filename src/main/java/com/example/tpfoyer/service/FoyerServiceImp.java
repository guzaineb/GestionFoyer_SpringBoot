package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Foyer;
import com.example.tpfoyer.repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImp implements IFoyerService {

    FoyerRepository foyerRepository;
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long foyerId) {
        return foyerRepository.findById(foyerId).get();
    }

    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }


    public void removeFoyer(Long foyerId) {
        foyerRepository.deleteById(foyerId);

    }


    public Foyer modifyFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
}
