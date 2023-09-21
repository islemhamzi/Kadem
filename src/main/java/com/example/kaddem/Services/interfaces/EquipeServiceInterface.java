package com.example.kaddem.Services.interfaces;

import com.example.kaddem.Entities.Equipe;

import java.util.List;

public interface EquipeServiceInterface {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);
}
