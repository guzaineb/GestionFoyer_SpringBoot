package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Bloc;
import com.example.tpfoyer.repository.BlocRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Slf4j
@EnableScheduling

public class BlocServiceImp implements IBlocService{
    BlocRepository blocRepository;
    @Scheduled(fixedRate = 1800000)
    public List<Bloc> retrieveAllBloc() {
        List<Bloc> lb = blocRepository.findAll();
        log.info("nbr blocs: " + lb.size());
        for(Bloc b: lb){
            log.info("bloc : " + b);
        }
        return lb;
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
