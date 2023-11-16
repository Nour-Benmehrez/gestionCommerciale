package com.example.cepex4.Services.Operateur;

import com.example.cepex4.entity.Operateur;

import java.util.List;

public interface IOperateurService {
    public Operateur AddOperateur(Operateur operateur);
    Operateur editOperateur(Operateur operateur);

    void deleteOperateur(Long oper_sqid);

    List<Operateur> retrieveAll();

    public Operateur retrieveById(long oper_sqid);
    List<String> getMatriculeF();
    List<Number> getOperSqid();
    //int findIdByMatricule(String matricule);
    List<String> getGouvernement1();
}
