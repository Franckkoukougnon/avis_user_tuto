package tech.franck.avisutilisateurs.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.franck.avisutilisateurs.model.Avis;
import tech.franck.avisutilisateurs.repository.AvisRepository;

import java.util.List;

@Service
public class AvisService {

    @Autowired
    private AvisRepository avisRepository;

    public void create(Avis avis){
        avisRepository.save(avis);
    }



}
