package com.example.tpfoyer.service;


import com.example.tpfoyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite  u);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);
}
