package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Bloc;
import com.example.tpfoyer.entity.Chambre;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBloc();
    public Bloc retrieveBloc(Long blocId);
    public Bloc addBloc(Bloc b);
    public void removeBloc(Long blocId);
    public Bloc modifyBloc(Bloc bloc);
}


