package com.example.cepex4.Controller;

import com.example.cepex4.Services.Operateur.OperateurService;
import com.example.cepex4.entity.Operateur;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/operateur")
public class OperateurController {
    OperateurService optS;

    @PostMapping("/ajouterOperateur")
    public String AddUser (@RequestBody Operateur operateur){
         optS.AddOperateur(operateur);
        return "Operateur Added succefuly!!";

    }

    @PutMapping("/edit-Operateur")
    public String editOperateur(@RequestBody Operateur p) {
          optS.editOperateur(p);
        return "Operateur edited succefuly!!";


    }
    
    @GetMapping("/all-Operateurs")
    public List<Operateur> getOperateurs()
    {
        return optS.retrieveAll();}

    @GetMapping("/retrieveById/{oper_sqid}")
    public Operateur getByOperateurs(@PathVariable Long oper_sqid){
        return optS.retrieveById(oper_sqid);}
    
    @DeleteMapping("/delete-Operateur/{oper_sqid}")
    public String deleteOperateur(@PathVariable Long oper_sqid) {
        optS.deleteOperateur(oper_sqid);
        return "Operateur deleted!!";
    }
    @GetMapping("/matriculeF")
    public List<String> getMatriculeF() {
        return optS.getMatriculeF();
    }
    @GetMapping("/operSqid")
    public List<Number> getoperSqid() {
        return optS.getOperSqid();
    }
    @GetMapping("/getGouvernement1")
        public List<String> getGouvernement1() {
            return optS.getGouvernement1();
    }
}