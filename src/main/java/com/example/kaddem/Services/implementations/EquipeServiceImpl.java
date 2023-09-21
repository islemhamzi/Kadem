package com.example.kaddem.Services.implementations;

import com.example.kaddem.Entities.Equipe;
import com.example.kaddem.Repositories.EquipeRepo;
import com.example.kaddem.Services.interfaces.EquipeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServiceImpl implements EquipeServiceInterface {

    final
    EquipeRepo equipeRepo ;

    public EquipeServiceImpl(EquipeRepo equipeRepo) {
        this.equipeRepo = equipeRepo;
    }

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepo.findAll() ;
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepo.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepo.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepo.findById(idEquipe).orElse(null);
    }
}
