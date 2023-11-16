package com.example.cepex4.repository.operateurs;

import com.example.cepex4.entity.Operateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperateurRepo extends JpaRepository<Operateur, Long> {
    @Query(value = "SELECT marticulefiscal FROM operateur",nativeQuery = true)
    List<String> getmatriculeF();

    @Query(value = "SELECT oper_sqid FROM operateur",nativeQuery = true)
   List<Number> getOperSqid();
}
