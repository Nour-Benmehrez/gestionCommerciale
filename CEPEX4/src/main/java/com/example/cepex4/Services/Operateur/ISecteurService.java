package com.example.cepex4.Services.Operateur;

import com.example.cepex4.entity.Operateur;
import com.example.cepex4.entity.Secteur;

import java.util.List;

public interface ISecteurService {
    public Secteur AddSecteur(Secteur secteur);
    Secteur editSecteur(Secteur secteur);

    void deleteSecteur(Long sect_id);

    List<Secteur> retrieveAll();
}
