package com.example.kaddem.Controllers;


import com.example.kaddem.Entities.Departement;
import com.example.kaddem.Entities.Etudiant;
import com.example.kaddem.Enumerations.Options;
import com.example.kaddem.Services.interfaces.DepartementServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/departement")
public class DepartementController {
    @Autowired
    DepartementServiceInterface departementServiceInterface ;
    @PostMapping("/addDep")
    public ResponseEntity<Departement> ajouterDepartement(@RequestBody Departement dep){

       Departement addedDep= departementServiceInterface.addDepartement(dep);

        return ResponseEntity.ok(addedDep);
    }

}
