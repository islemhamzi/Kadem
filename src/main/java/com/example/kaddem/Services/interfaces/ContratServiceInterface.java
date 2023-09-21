package com.example.kaddem.Services.interfaces;

import com.example.kaddem.Entities.Contrat;

import java.util.List;
import java.util.Optional;

public interface ContratServiceInterface {

    List<Contrat> retrieveAllContrats();

    Contrat addContrat (Contrat ce);


            Contrat updateContrat (Contrat ce);

   Contrat retrieveContrat (Integer idContrat);

void removeContrat(Integer idContrat);
}
