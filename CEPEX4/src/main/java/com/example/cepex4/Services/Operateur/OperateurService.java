package com.example.cepex4.Services.Operateur;

import com.example.cepex4.entity.Operateur;
import com.example.cepex4.repository.operateurs.OperateurRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class OperateurService implements IOperateurService{
    @Autowired
    OperateurRepo oprRepo;

    @Override
    public Operateur AddOperateur(Operateur operateur) {
        try {
            return oprRepo.save(operateur) ;
        }
        catch (Exception e) {
        throw new RuntimeException("Failed to add operateur", e);
    }}

    @Override
    public Operateur editOperateur(Operateur operateur)throws RuntimeException {
        if(operateur.getOper_sqid()==null)
        {throw new IllegalArgumentException("Operateur ID cannot be null");
        }
        try {
            return oprRepo.save(operateur) ;
        }
        catch (Exception e) {
            throw new RuntimeException("Failed to update operateur", e);
        }  
    }
    @Override
    public void deleteOperateur(Long oper_sqid) {
        Optional<Operateur> Operateur = oprRepo.findById(oper_sqid);

        Operateur.ifPresent(p -> {
            oprRepo.delete(p);
            log.info("Operateur with id " + oper_sqid + " has been deleted");
        });
    }
    @Override
    public List<Operateur> retrieveAll() {
        return oprRepo.findAll();
    }
    @Override
    public Operateur retrieveById(long oper_sqid) {
        return oprRepo.findById(oper_sqid).get();
    }

    @Override
    public List<String> getMatriculeF() {
        return oprRepo.getmatriculeF();
    }

    @Override
    public List<Number> getOperSqid() {
        return oprRepo.getOperSqid();
    }

    @Override
    public List<String> getGouvernement1() {
        return null;
                //oprRepo.getGouvernement1();
    }

}
