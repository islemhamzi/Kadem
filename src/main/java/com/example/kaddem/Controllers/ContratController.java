package com.example.kaddem.Controllers;


import com.example.kaddem.Entities.Contrat;
import com.example.kaddem.Entities.Equipe;
import com.example.kaddem.Services.implementations.ContratServiceImpl;
import com.example.kaddem.Services.interfaces.ContratServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/contrat")
public class ContratController {

    final
    ContratServiceInterface contratServiceInterface;


    public ContratController(ContratServiceInterface contratServiceInterface) {
        this.contratServiceInterface = contratServiceInterface;
    }




    @PostMapping("/addContrat")
    public ResponseEntity<Contrat> ajouterContrat(@RequestBody Contrat contrat){

        Contrat addedContrat= contratServiceInterface.addContrat(contrat);

        return ResponseEntity.ok(addedContrat);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Contrat>> getAllContrat(){
        return ResponseEntity.ok(contratServiceInterface.retrieveAllContrats());
    }


    @PutMapping("/putContrat")
    public ResponseEntity<Contrat> modifierContrat(@RequestBody Contrat contrat){

        Contrat addedContrat = contratServiceInterface.updateContrat(contrat);

        return ResponseEntity.ok(addedContrat);
    }
    @GetMapping("/getOne/{id}")
    public Contrat getOneContrat(@PathVariable int id){
        return contratServiceInterface.retrieveContrat(id);
    }
















}
