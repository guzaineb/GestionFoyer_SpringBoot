package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Bloc;
import com.example.tpfoyer.repository.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImp implements IBlocService{
    BlocRepository blocRepository;
    public List<Bloc> retrieveAllBloc() {
        return blocRepository.findAll();
    }


    public Bloc retrieveBloc(Long blocId) {
        return blocRepository.findById(blocId).get();
    }

    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }


    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);

    }


    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
