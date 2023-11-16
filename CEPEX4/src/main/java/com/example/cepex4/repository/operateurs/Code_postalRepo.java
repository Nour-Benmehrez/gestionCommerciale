package com.example.cepex4.repository.operateurs;

import com.example.cepex4.entity.Code_postal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Code_postalRepo extends JpaRepository<Code_postal, Long> {
}
