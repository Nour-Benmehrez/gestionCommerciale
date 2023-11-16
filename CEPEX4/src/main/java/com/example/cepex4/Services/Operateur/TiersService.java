package com.example.cepex4.Services.Operateur;

import com.example.cepex4.entity.Operateur;
import com.example.cepex4.entity.Tiers;
import com.example.cepex4.repository.operateurs.TiersRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class TiersService implements ITiersService{
    @Autowired
    TiersRepo tiersRepo;

    @Override
    public Tiers AddTiers(Tiers tiers) {
        try {
            return tiersRepo.save(tiers) ;
        }
        catch (Exception e) {
            throw new RuntimeException("Failed to add tiers", e);
        }}

    @Override
    public Tiers editTiers(Tiers tiers) throws RuntimeException {
            if(tiers.getTiers_sqid()==null)
            {throw new IllegalArgumentException("tiers ID cannot be null");
            }
            try {
                return tiersRepo.save(tiers) ;
            }
            catch (Exception e) {
                throw new RuntimeException("Failed to update tiers", e);
            }      }

    @Override
    public void deleteTiers(Long tiers_sqid) {
        Optional<Tiers> Tiers = tiersRepo.findById(tiers_sqid);

        Tiers.ifPresent(p -> {
            tiersRepo.delete(p);
            log.info("tiers with id " + tiers_sqid + " has been deleted");
        });
    }

    @Override
    public List<Tiers> retrieveAll() {
        return tiersRepo.findAll();
    }

    @Override
    public Tiers retrieveById(long tiers_sqid) {
        return tiersRepo.findById(tiers_sqid).get();
    }
}
