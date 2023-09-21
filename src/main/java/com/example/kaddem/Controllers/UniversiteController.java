package com.example.kaddem.Controllers;

import com.example.kaddem.Entities.Etudiant;
import com.example.kaddem.Entities.Universite;
import com.example.kaddem.Enumerations.Options;
import com.example.kaddem.Services.interfaces.UniversiteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/universite")
public class UniversiteController {
    final
    UniversiteServiceInterface universiteServiceInterface;

    public UniversiteController(UniversiteServiceInterface universiteServiceInterface) {
        this.universiteServiceInterface = universiteServiceInterface;
    }

    @PostMapping("/addUniversite")
    public ResponseEntity<Universite> ajouterUniversite(@RequestBody Universite universite){

        Universite addedUniversite= universiteServiceInterface.addUniversite(universite);

        return ResponseEntity.ok(addedUniversite);
    }



    @PutMapping("/addUniversiteDep/{uniId}/{depId}")
    public ResponseEntity<Universite> ajouterUnivDep(@PathVariable int uniId,@PathVariable int depId){

        universiteServiceInterface.assignUniversiteToDepartement(uniId,depId);

        return ResponseEntity.status(HttpStatus.OK).build();
    }





}
