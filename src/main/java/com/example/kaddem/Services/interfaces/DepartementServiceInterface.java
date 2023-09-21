package com.example.kaddem.Services.interfaces;

import com.example.kaddem.Entities.Departement;

import java.util.List;

public interface DepartementServiceInterface {
    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);
}
