package com.example.kaddem.Services.implementations;

import com.example.kaddem.Entities.Contrat;
import com.example.kaddem.Repositories.ContratRepo;
import com.example.kaddem.Services.interfaces.ContratServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratServiceImpl implements ContratServiceInterface {

    final
    ContratRepo contratRepo ;

    public ContratServiceImpl(ContratRepo contratRepo) {
        this.contratRepo = contratRepo;
    }


    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepo.findAll();
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratRepo.save(ce);
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepo.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return contratRepo.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratRepo.deleteById(idContrat);

    }
}
