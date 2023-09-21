package com.example.kaddem.Entities;

import com.example.kaddem.Enumerations.Specialite;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat ;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat ;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat ;
    private Specialite specialite ;
    private  Boolean archive ;

    @ManyToOne
    private Etudiant etudiant ;

}
