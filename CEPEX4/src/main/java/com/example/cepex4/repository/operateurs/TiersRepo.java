package com.example.cepex4.repository.operateurs;

import com.example.cepex4.entity.Tiers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiersRepo extends JpaRepository<Tiers, Long> {
}
