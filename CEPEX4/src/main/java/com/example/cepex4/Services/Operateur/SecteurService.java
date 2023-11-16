package com.example.cepex4.Services.Operateur;

import com.example.cepex4.entity.Operateur;
import com.example.cepex4.entity.Secteur;
import com.example.cepex4.repository.operateurs.SecteurRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class SecteurService implements ISecteurService {
@Autowired
    SecteurRepo secteurRepo;

    @Override
    public Secteur AddSecteur(Secteur secteur) {
        try {
            return secteurRepo.save(secteur) ;
        }
        catch (Exception e) {
            throw new RuntimeException("Failed to add secteur", e);
        }    }

    @Override
    public Secteur editSecteur(Secteur secteur)throws RuntimeException {
        if(secteur.getSect_id()==null)
        {throw new IllegalArgumentException("secteur ID cannot be null");
        }
        try {
            return secteurRepo.save(secteur) ;
        }
        catch (Exception e) {
            throw new RuntimeException("Failed to update secteur", e);
        }
    }

    @Override
    public void deleteSecteur(Long sect_id) {
        Optional<Secteur> Secteur = secteurRepo.findById(sect_id);

        Secteur.ifPresent(p -> {
            secteurRepo.delete(p);
            log.info("Secteur with id " + sect_id + " has been deleted");
        });
    }

    @Override
    public List<Secteur> retrieveAll() {
        return secteurRepo.findAll();
    }
}
