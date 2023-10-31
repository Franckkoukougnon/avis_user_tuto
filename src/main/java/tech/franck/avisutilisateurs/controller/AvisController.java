package tech.franck.avisutilisateurs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.franck.avisutilisateurs.model.Avis;
import tech.franck.avisutilisateurs.service.AvisService;

import java.util.List;

@RestController
@RequestMapping("/avis")
public class AvisController {

    @Autowired
    private AvisService avisService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public void createAvis(@RequestBody Avis avis){
        avisService.create(avis);
    }




}
