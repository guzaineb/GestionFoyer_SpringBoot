package com.example.tpfoyer.control;

import com.example.tpfoyer.entity.Foyer;
import com.example.tpfoyer.service.IFoyerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@Tag(name ="Gestion foyer ")
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService foyerService;
    //http://localhost:8089/tpfoyer/foyer/getAllFoyers
@Operation(description = "récupérer toutes les foyer de la base de données")
@GetMapping("/getAllFoyers")
    public List<Foyer> retrieveAllFoyers(){
    List<Foyer> foyers= foyerService.retrieveAllFoyers();
    return foyers;}

//http://localhost:8089/tpfoyer/foyer/retrive-foyer/3
@Operation(description = "récupérer  le foyer de la base de données")
      @GetMapping("/retrive-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foyerId){
          Foyer foyer =foyerService.retrieveFoyer(foyerId);
          return foyer;

        }
        //http://localhost:8089/tpfoyer/foyer/add-foyer
        @Operation(description = "ajouter un nouveau foyer")
        @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f){
    Foyer foyer = foyerService.addFoyer(f);
    return foyer;

    }
    //http://localhost:8089/tpfoyer/foyer/remove-foyer/2
    @Operation(description = "supprimer foyer ")
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long foyerId){
    foyerService.removeFoyer(foyerId);

    }
    //http://localhost:8089/tpfoyer/foyer/modify-foyer
    @Operation(description = "modifier foyer ")
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer foyer) {
        Foyer f = foyerService.modifyFoyer(foyer);
        return f;
    }


    @PostMapping("/addfoyerwithbloc")
    public Foyer addFoyerWithBloc(@RequestBody Foyer foyer) {
        Foyer f =foyerService.addFoyerWithBloc(foyer);
        return f;
            }

@PutMapping("/affecter-foyer-a-blocs/{foyer-id}/{bloc-id}")
    public void addFoyerToBloc(@PathVariable("foyer-id") Long foyerId,@PathVariable("bloc-id") Long blocId){
    foyerService.addFoyerToBloc(foyerId, blocId);

    }

    @DeleteMapping("/desaffecterFoyerBlocs/{foyer-id}/{bloc-id}")
    public void desaffecterFoyerBloc(Long foyerId, Long blocId) {
    foyerService.desaffecterFoyerBloc(foyerId, blocId);

        }




}

