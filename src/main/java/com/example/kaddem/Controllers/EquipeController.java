package com.example.kaddem.Controllers;


import com.example.kaddem.Entities.Departement;
import com.example.kaddem.Entities.Equipe;
import com.example.kaddem.Entities.Etudiant;
import com.example.kaddem.Enumerations.Options;
import com.example.kaddem.Services.interfaces.EquipeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/equipe")
public class EquipeController {

    final
    EquipeServiceInterface equipeServiceInterface ;

    public EquipeController(EquipeServiceInterface equipeServiceInterface) {
        this.equipeServiceInterface = equipeServiceInterface;
    }


    @PostMapping("/addEquipe")
    public ResponseEntity<Equipe> ajouterEquipe(@RequestBody Equipe equipe){

        Equipe addedEquipe= equipeServiceInterface.addEquipe(equipe);

        return ResponseEntity.ok(addedEquipe);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Equipe>> getAllStudents(){
        return ResponseEntity.ok(equipeServiceInterface.retrieveAllEquipes());
    }


    @PutMapping("/putEquipe")
    public ResponseEntity<Equipe> modifierEtudiant(@RequestBody Equipe e){

        Equipe addedEquipe = equipeServiceInterface.addEquipe(e);

        return ResponseEntity.ok(addedEquipe);
    }
    @GetMapping("/getOne/{id}")
    public Equipe getOneStudent(@PathVariable int id){
        return equipeServiceInterface.retrieveEquipe(id);
    }









}
