package com.example.kaddem.Services.interfaces;

import com.example.kaddem.Entities.Departement;
import com.example.kaddem.Entities.Etudiant;
import com.example.kaddem.Enumerations.Options;

import java.util.List;

public interface EtudiantServiceInterface {

   public List<Etudiant> retrieveAllEtudiants();
public  Etudiant addEtudiant (Etudiant e, Options o);
    public void addAndAssignEtudiant(int idEtudiant, int idDep);
  public  Etudiant updateEtudiant(Etudiant e );
    public Etudiant retrieveEtudiant(Integer idEtudiant);
  public  void removeEtudiant(Integer idEtudiant);

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,
                                                     Integer idEquipe);

}
