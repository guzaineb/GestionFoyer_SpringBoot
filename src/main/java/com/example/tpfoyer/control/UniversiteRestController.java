package com.example.tpfoyer.control;

import com.example.tpfoyer.entity.Universite;
import com.example.tpfoyer.service.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
//http://localhost:8089/tpfoyer/universite
@RequestMapping("/universite")

public class UniversiteRestController {
    IUniversiteService universiteService;

//http://localhost:8089/tpfoyer/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> retrieveAllUniversites(){
        List<Universite> listUniversites =universiteService.retrieveAllUniversites();
        return listUniversites;
    }
    //http://localhost:8089/tpfoyer/universite/getUniversite/1
    @GetMapping("/getUniversite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long universiteId){
        Universite universite =universiteService.retrieveUniversite(universiteId);
        return universite;
    }
    //http://localhost:8089/tpfoyer/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite  u){
       Universite universite =universiteService.addUniversite(u);
       return universite;
    }
    //http://localhost:8089/tpfoyer/universite/remove-uni/3
    @DeleteMapping("/remove-uni/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long universiteId){
        universiteService.removeUniversite(universiteId);
    }
    //http://localhost:8089/tpfoyer/universite/modify-uni
    @PutMapping("/modify-uni")
    public Universite modifyUniversite(@RequestBody Universite universite){
        Universite universite1 =universiteService.modifyUniversite(universite);
        return  universite1;
    }


}
