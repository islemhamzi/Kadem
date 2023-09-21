package com.example.kaddem.Services.implementations;

import com.example.kaddem.Entities.Contrat;
import com.example.kaddem.Entities.Departement;
import com.example.kaddem.Entities.Equipe;
import com.example.kaddem.Entities.Etudiant;
import com.example.kaddem.Enumerations.Options;
import com.example.kaddem.Repositories.ContratRepo;
import com.example.kaddem.Repositories.DepartementRepo;
import com.example.kaddem.Repositories.EquipeRepo;
import com.example.kaddem.Repositories.EtudiantRepo;
import com.example.kaddem.Services.interfaces.EtudiantServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantServiceInterface {

    final
    ContratRepo contratRepo;
    final
    DepartementRepo departementRepo;
final
EquipeRepo equipeRepo;

    private final EtudiantRepo etudiantRepo;

    public EtudiantServiceImpl(EtudiantRepo etudiantRepo, DepartementRepo departementRepo, EquipeRepo equipeRepo, ContratRepo contratRepo) {
        this.etudiantRepo = etudiantRepo;
        this.departementRepo = departementRepo;
        this.equipeRepo = equipeRepo;
        this.contratRepo = contratRepo;
    }


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
       return etudiantRepo.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e, Options o) {
        return etudiantRepo.save(e);
    }

    @Override
    public void addAndAssignEtudiant(int idEtudiant,  int idDep) {
        Etudiant etudiant = etudiantRepo.findById(idEtudiant).orElse(null);
        Departement dep = departementRepo.findById(idDep).orElse(null);
if(dep!=null&&etudiant!=null)
{etudiant.setDepartement(dep);
 etudiantRepo.save(etudiant);}

    }

    @Override public Etudiant updateEtudiant(Etudiant e) {

        return etudiantRepo.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepo.findById(idEtudiant).orElse(null);

    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
         etudiantRepo.deleteById(idEtudiant);

    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat contrat = contratRepo.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepo.findById(idEquipe).orElse(null);
        e.getContrats().add(contrat);
        e.getEquipes().add(equipe);


        return etudiantRepo.save(e);
    }
}
