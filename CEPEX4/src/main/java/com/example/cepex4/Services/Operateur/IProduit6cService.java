package com.example.cepex4.Services.Operateur;

import com.example.cepex4.entity.Produit6c;

import java.util.List;

public interface IProduit6cService {

    public Produit6c AddProduit6c(Produit6c produit6c);
    Produit6c editProduit6c(Produit6c produit6c);

    void deleteProduit6c(Long oper_sqid);

    List<Produit6c> retrieveAll();
}
