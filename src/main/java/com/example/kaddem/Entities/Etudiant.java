package com.example.kaddem.Entities;

import com.example.kaddem.Enumerations.Options;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.ConstructorParameters;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String prenomE ;
    private String nomE;
    private Options options;
    private String pwd ;
    @Transient
    private String confirm_pwd;

@OneToMany(mappedBy = "etudiant")
    private List<Contrat> contrats;

@ManyToOne
 private Departement departement;

@ManyToMany
    private List<Equipe> equipes ;
}
