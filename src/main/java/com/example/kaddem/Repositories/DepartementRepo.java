package com.example.kaddem.Repositories;

import com.example.kaddem.Entities.Contrat;
import com.example.kaddem.Entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepo extends JpaRepository<Departement, Integer> {
}
