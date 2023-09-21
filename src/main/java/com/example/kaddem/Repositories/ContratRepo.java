package com.example.kaddem.Repositories;

import com.example.kaddem.Entities.Contrat;
import com.example.kaddem.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepo extends JpaRepository<Contrat, Integer> {
}
