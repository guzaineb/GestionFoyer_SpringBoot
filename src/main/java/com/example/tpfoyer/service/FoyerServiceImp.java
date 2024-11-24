package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Bloc;
import com.example.tpfoyer.entity.Foyer;
import com.example.tpfoyer.repository.BlocRepository;
import com.example.tpfoyer.repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImp implements IFoyerService {

    FoyerRepository foyerRepository;
    BlocRepository blocRepository;
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

    @Override
    public Foyer addFoyerWithBloc(Foyer foyer) {
         return foyerRepository.save(foyer);
    }

    @Override
    public void addFoyerToBloc(Long foyerId, Long blocId) {
        Foyer foyer= foyerRepository.findById(foyerId).get();
        Bloc bloc = blocRepository.findById(blocId).get();
        //on set le fils dans le parent
        foyer.getBlocS().add(bloc);
        foyerRepository.save(foyer);
    }

    @Override
    public void desaffecterFoyerBloc(Long foyerId, Long blocId) {
        Foyer foyer= foyerRepository.findById(foyerId).get();
        Bloc bloc = blocRepository.findById(blocId).get();
        foyer.getBlocS().remove(bloc);
        foyerRepository.save(foyer);
    }

}
