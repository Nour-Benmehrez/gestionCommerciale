package com.example.cepex4.Services.Operateur;

import com.example.cepex4.entity.Operateur;
import com.example.cepex4.entity.Produit6c;
import com.example.cepex4.repository.operateurs.Produit6cRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
@Slf4j
public class Produit6cService implements IProduit6cService{
    @Autowired
    Produit6cRepo produit6cRepo;
    @Override
    public Produit6c AddProduit6c(Produit6c produit6c) {
       try{
           return produit6cRepo.save(produit6c) ;
       }
       catch (Exception e){
           throw new RuntimeException("Failed to add product! ", e);
       }
    }

    @Override
    public Produit6c editProduit6c(Produit6c produit6c) throws RuntimeException {
        if(produit6c.getPrd6_id()==null)
        {throw new IllegalArgumentException("produit6c ID cannot be null");
        }
        try {
            return produit6cRepo.save(produit6c) ;
        }
        catch (Exception e) {
            throw new RuntimeException("Failed to update produit6c", e);
        }
    }

    @Override
    public void deleteProduit6c(Long prd6_id) {
        Optional<Produit6c> Produit6c = produit6cRepo.findById(prd6_id);

        Produit6c.ifPresent(p -> {
            produit6cRepo.delete(p);
            log.info("Product with id " + prd6_id + " has been deleted");
        });
    }

    @Override
    public List<Produit6c> retrieveAll() {
        return produit6cRepo.findAll();
    }
}
