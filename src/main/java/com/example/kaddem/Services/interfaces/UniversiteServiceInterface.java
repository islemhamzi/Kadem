package com.example.kaddem.Services.interfaces;

import com.example.kaddem.Entities.Universite;

import java.util.List;

public interface UniversiteServiceInterface {

    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);

    public void assignUniversiteToDepartement(Integer idUniversite, Integer
            idDepartement);

}
