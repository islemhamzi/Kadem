package com.example.kaddem.Repositories;

import com.example.kaddem.Entities.Etudiant;
import com.example.kaddem.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepo extends JpaRepository<Universite, Integer> {
}
