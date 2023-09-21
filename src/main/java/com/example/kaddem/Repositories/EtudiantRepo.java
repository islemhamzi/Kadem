package com.example.kaddem.Repositories;

import com.example.kaddem.Entities.Departement;
import com.example.kaddem.Entities.Etudiant;
import com.example.kaddem.Enumerations.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant, Integer> {



}
