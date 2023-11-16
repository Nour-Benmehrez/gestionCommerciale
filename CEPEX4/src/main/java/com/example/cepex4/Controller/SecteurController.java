package com.example.cepex4.Controller;

import com.example.cepex4.Services.Operateur.SecteurService;
import com.example.cepex4.entity.Secteur;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/secteur")
public class SecteurController {
    @Autowired
    SecteurService secteurService;
    
    
    @PostMapping("/ajouterSecteur")
    public String AddUser (@RequestBody Secteur secteur){
        secteurService.AddSecteur(secteur);
        return "Secteur Added succefuly!!";

    }

    @PutMapping("/edit-Secteur")
    public String editSecteur(@RequestBody Secteur p) {
        secteurService.editSecteur(p);
        return "Secteur edited succefuly!!";


    }

    @GetMapping("/all-Secteurs")
    public List<Secteur> getSecteurs()
    {
        return secteurService.retrieveAll();}


    @DeleteMapping("/delete-Secteur/{oper_sqid}")
    public String deleteSecteur(@PathVariable Long oper_sqid) {
        secteurService.deleteSecteur(oper_sqid);
        return "Secteur deleted!!";
    }
}
