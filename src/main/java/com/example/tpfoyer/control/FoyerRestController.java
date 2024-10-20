package com.example.tpfoyer.control;

import com.example.tpfoyer.entity.Foyer;
import com.example.tpfoyer.service.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService foyerService;
//http://localhost:8089/tpfoyer/foyer/getAllFoyers
@GetMapping("/getAllFoyers")
    public List<Foyer> retrieveAllFoyers(){
    List<Foyer> foyers= foyerService.retrieveAllFoyers();
    return foyers;}

      @GetMapping("/retrive-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foyerId){
          Foyer foyer =foyerService.retrieveFoyer(foyerId);
          return foyer;

        }
        //http://localhost:8089/tpfoyer/foyer/add-foyer
        @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f){
    Foyer foyer = foyerService.addFoyer(f);
    return foyer;

    }
    //http://localhost:8089/tpfoyer/foyer/remove-foyer/2
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long foyerId){
    foyerService.removeFoyer(foyerId);

    }
    //http://localhost:8089/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer foyer){
    Foyer f = foyerService.modifyFoyer(foyer);
    return f;


    }

}

