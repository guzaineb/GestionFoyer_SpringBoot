package com.example.tpfoyer.control;

import com.example.tpfoyer.entity.Etudiant;
import com.example.tpfoyer.service.IEtudientService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Etudiant")

public class EtudientRestController {
    IEtudientService etudientService;
//http://localhost:8089/tpfoyer/Etudiant/retrieveAllEtudiant
    @GetMapping("/retrieveAllEtudiant")
    public List<Etudiant> retrieveAllEtudiant(){
        List<Etudiant> etudiants = etudientService.retrieveAllEtudiant();
        return etudiants;

    }
    //http://localhost:8089/tpfoyer/Etudiant/retrieve-etudient/5
    @GetMapping("/retrieve-etudient/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long EtudiantId){
        Etudiant etudiant = etudientService.retrieveEtudiant(EtudiantId);
        return etudiant;}
//http://localhost:8089/tpfoyer/Etudiant/add-Etudiant
    @PostMapping("/add-Etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        Etudiant entidient = etudientService.addEtudiant(e);
        return entidient;
      }
      //http://localhost:8089/tpfoyer/Etudiant/remove-etudiant/3
      @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long EtudiantId){
        etudientService.removeEtudiant(EtudiantId);
    }
    //http://localhost:8089/tpfoyer/Etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant etudiant){
        Etudiant entidient = etudientService.modifyEtudiant(etudiant);
        return entidient;
    }
    @GetMapping("/findAllByDateNaissanceAfterAndEcole/{dateNaissance}/{ecole}")
    List<Etudiant> findAllByDateNaissanceAfterAndEcole(@PathVariable("dateNaissance")
                                                       @DateTimeFormat(pattern="yyyy-MM-dd") Date dateNaissance, @PathVariable("ecole") String ecole){
        List<Etudiant> etudiants=etudientService.findAllByDateNaissanceAfterAndEcole(dateNaissance,ecole);
        return etudiants;
    }
    @GetMapping("/findAllByEcoleAndDateNaissanceAfter/{ecole}/{dateNaissance}")
    public List<Etudiant> findAllByEcoleAndDateNaissanceAfter(@PathVariable("ecole") String ecole, @PathVariable("dateNaissance")
    @DateTimeFormat(pattern="yyyy-MM-dd")Date dateNaissance) {

     List<Etudiant> e =etudientService.findAllByEcoleAndDateNaissanceAfter(ecole,dateNaissance);
     return e;
    }

    }
