package com.example.kaddem.Services.implementations;

import com.example.kaddem.Entities.Departement;
import com.example.kaddem.Entities.Etudiant;
import com.example.kaddem.Entities.Universite;
import com.example.kaddem.Repositories.DepartementRepo;
import com.example.kaddem.Repositories.UniversiteRepo;
import com.example.kaddem.Services.interfaces.UniversiteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversiteServiceImpl implements UniversiteServiceInterface {

    final
    UniversiteRepo universiteRepo;

    public UniversiteServiceImpl(UniversiteRepo universiteRepo, DepartementRepo departementRepo) {
        this.universiteRepo = universiteRepo;
        this.departementRepo = departementRepo;
    }

final
DepartementRepo departementRepo ;




    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepo.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepo.findById(idUniversite).orElse(null);
    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universite= universiteRepo.findById(idUniversite).orElse(null);
        Departement dep =  departementRepo.findById(idDepartement).orElse(null);
        List<Departement> deps= universite.getDepartements();
        if(dep!=null&&universite!=null) {
              deps.add(dep);

            universiteRepo.save(universite);}
    }
}
