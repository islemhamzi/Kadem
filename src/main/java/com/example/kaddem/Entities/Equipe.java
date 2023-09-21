package com.example.kaddem.Entities;

import com.example.kaddem.Enumerations.Niveau;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipe {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    private String nomEquipe ;
    private Niveau niveau;

@ManyToMany(mappedBy="equipes")
    private List<Etudiant> etudiants;


@OneToOne
    private DetailEquipe detail ;

}
