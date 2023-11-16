package com.example.cepex4.repository.operateurs;

import com.example.cepex4.entity.Produit2c;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Produit2cRepo extends JpaRepository<Produit2c, Long> {
}
