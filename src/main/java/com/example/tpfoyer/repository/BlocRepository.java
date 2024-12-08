package com.example.tpfoyer.repository;

import com.example.tpfoyer.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    //Récupérer les blocs qui ont une capacité supérieure à 50
   //  List<Bloc> findByCapaciteBloc(Long capaciteBloc);
     //Récupérer les blocs qui ont un nom qui commence de "bI"
//List<Bloc>findAllByNomBlocStartsWith(String nB);

    //Récupérer les blocs qui ont un nom qui commence de "bI"et une capacité supérieur à une valeur donnée

    //List<Bloc>findAllByNomBlocStartsWithAndCapaciteBlocGreaterThan(String nB, Long cB);
    //Récupérer les blocs qui ont un nom donné
}
