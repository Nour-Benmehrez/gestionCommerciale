package com.example.cepex4.repository.operateurs;

import com.example.cepex4.entity.Produit4c;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Produit4cRepo extends JpaRepository<Produit4c, Long> {
}
