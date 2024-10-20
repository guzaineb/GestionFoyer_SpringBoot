package com.example.tpfoyer.control;

import com.example.tpfoyer.entity.Bloc;
import com.example.tpfoyer.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")

public class blocRestController {
    IBlocService blocService;
    // http://localhost:8089/tpfoyer/bloc/getAll
    @GetMapping("/getAll")
    public List<Bloc> retrieveAllBloc(){
        List<Bloc> blocs = blocService.retrieveAllBloc();
        return blocs;
    }
    // http://localhost:8089/tpfoyer/bloc/getbloc/{bloc-id}
    @GetMapping("/getbloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long blocId){
          Bloc bloc = blocService.retrieveBloc(blocId);
          return bloc;
        // http://localhost:8089/tpfoyer/bloc/addbloc
    }@PostMapping("/addbloc")
    public Bloc addBloc(@RequestBody Bloc b){
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    //http://localhost:8089/tpfoyer/bloc/delete-bloc/3
    @DeleteMapping("/delete-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long blocId){
        blocService.removeBloc(blocId);

    }
    //http://localhost:8089/tpfoyer/bloc/modifier-bloc
    @PutMapping("/modifier-bloc")
    public Bloc modifyBloc( @RequestBody Bloc b){
        Bloc bloc =blocService.modifyBloc(b);
        return bloc;

    }
}
