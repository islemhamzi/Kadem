package com.example.kaddem.Services.implementations;

import com.example.kaddem.Entities.Departement;
import com.example.kaddem.Repositories.DepartementRepo;
import com.example.kaddem.Services.interfaces.DepartementServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementServiceImpl implements DepartementServiceInterface {

    @Autowired
    DepartementRepo departementRepo;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementRepo.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return departementRepo.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepo.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepo.findById(idDepart).orElse(null);
    }
}
