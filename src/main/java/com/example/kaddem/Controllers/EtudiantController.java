package com.example.kaddem.Controllers;

import com.example.kaddem.Entities.Departement;
import com.example.kaddem.Entities.Etudiant;
import com.example.kaddem.Enumerations.Options;
import com.example.kaddem.Services.implementations.EtudiantServiceImpl;
import com.example.kaddem.Services.interfaces.EtudiantServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {
    private final EtudiantServiceInterface etudiantService ;

    public EtudiantController(EtudiantServiceInterface etudiantService) {
        this.etudiantService = etudiantService;
    }


    @PostMapping("/addEtudiant")
    public ResponseEntity<Etudiant> ajouterEtudiant(@RequestBody Etudiant e, Options o){

        Etudiant addedEtudiant = etudiantService.addEtudiant(e,o);

        return ResponseEntity.ok(addedEtudiant);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Etudiant>> getAllStudents(){
        return ResponseEntity.ok(etudiantService.retrieveAllEtudiants());
    }


    @PutMapping("/putEtudiant")
    public ResponseEntity<Etudiant> modifierEtudiant(@RequestBody Etudiant e, Options o){

        Etudiant addedEtudiant = etudiantService.updateEtudiant(e);

        return ResponseEntity.ok(addedEtudiant);
    }
    @GetMapping("/getOne/{id}")
    public Etudiant getOneStudent(@PathVariable int id){
        return etudiantService.retrieveEtudiant(id);
    }

    @DeleteMapping("/deleteOne/{id}")
    public String DeleteOneStudent(@PathVariable int id){
         etudiantService.removeEtudiant(id);
         return "deleted";
    }


    @PutMapping("/addEtudiantDep/{etudiantId}/{depId}")
    public ResponseEntity<Etudiant> ajouterEtudiantDep(@PathVariable int etudiantId,@PathVariable int depId){

        etudiantService.addAndAssignEtudiant(etudiantId, depId);

        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @PutMapping("/addEtudiantEquipeContrat/{idContrat}/{idEquipe}")
    public ResponseEntity<Etudiant> affecterContratEquipe(@PathVariable int idContrat,@PathVariable int idEquipe, @RequestBody Etudiant e){

        etudiantService.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);

        return ResponseEntity.status(HttpStatus.OK).build();
    }







}




































/*

public class PatientController {

    @Autowired
    private PatientService patientService;

    @PutMapping("edit/{id}")
    public ResponseEntity<Patient> editPatient(@PathVariable(name = "id") String id, @RequestBody Patient patient){

        Patient updatedPatient = patientService.updatePatient(patient, id);

        return ResponseEntity.ok(updatedPatient);
    }



    @GetMapping("/getPatient/{id}")
    public ResponseEntity<?> getUserDetailsById(@PathVariable  String id){
        System.out.print(id);
        return  new ResponseEntity(patientService.getPatient(id),HttpStatus.OK);

    }



    @GetMapping("/getPatientMail/{mail}")
    public ResponseEntity<?> getUserDetailsByMail(@PathVariable  String mail){
        System.out.print(mail);
        return  new ResponseEntity(patientService.getPatientMail(mail),HttpStatus.OK);

    }



	@PostMapping(path = "/addAtecedentToPatient/{patientId}")
	public Patient addAntecetentToPatient (@PathVariable String patientId, @RequestBody Atcd antc) {
		return patientService.addAtcdtoPatient(patientId,antc);
	}





    @PostMapping("/ajouter")
    public ResponseEntity<Patient> ajouterPatient(@RequestBody Patient patient){

        Patient addedPatient = patientService.ajoutPatient(patient);

        return ResponseEntity.ok(addedPatient);
    }


    @GetMapping("/birthday/{keyword}")
    public ResponseEntity<List<?>> searchPatient(@PathVariable("keyword") @DateTimeFormat(pattern = "dd-MM-yyyy")LocalDate keyword) {

        return  new ResponseEntity(patientService.getPatientByKeyword(keyword),HttpStatus.OK);

    }

*/



