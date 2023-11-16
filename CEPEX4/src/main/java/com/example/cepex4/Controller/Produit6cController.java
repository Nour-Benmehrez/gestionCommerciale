package com.example.cepex4.Controller;
import com.example.cepex4.Services.Operateur.Produit6cService;
import com.example.cepex4.entity.Produit6c;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/produit6c")
public class Produit6cController {
    Produit6cService produit6cService;

    @PostMapping("/ajouterProduit6c")
    public String AddUser (@RequestBody Produit6c produit6c){
        produit6cService.AddProduit6c(produit6c);
        return "Produit6c Added succefuly!!";

    }

    @PutMapping("/edit-Produit6c")
    public String editProduit6c(@RequestBody Produit6c p) {
        produit6cService.editProduit6c(p);
        return "Produit6c edited succefuly!!";


    }

    @GetMapping("/all-Produit6cs")
    public List<Produit6c> getProduit6cs()
    {
        return produit6cService.retrieveAll();}


    @DeleteMapping("/delete-Produit6c/{oper_sqid}")
    public String deleteProduit6c(@PathVariable Long oper_sqid) {
        produit6cService.deleteProduit6c(oper_sqid);
        return "Produit6c deleted!!";
    }
}
