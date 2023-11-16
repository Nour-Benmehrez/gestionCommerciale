package com.example.cepex4.Services.Operateur;

import com.example.cepex4.entity.Operateur;
import com.example.cepex4.entity.Tiers;

import java.util.List;

public interface ITiersService {
    public Tiers AddTiers(Tiers tiers);
    Tiers editTiers(Tiers tiers);

    void deleteTiers(Long tiers_sqid);

    List<Tiers> retrieveAll();

    public Tiers retrieveById(long tiers_sqid);
}
