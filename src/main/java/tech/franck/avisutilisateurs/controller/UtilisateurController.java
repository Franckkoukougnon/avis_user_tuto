package tech.franck.avisutilisateurs.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.franck.avisutilisateurs.model.Utilisateur;
import tech.franck.avisutilisateurs.service.UtilisateurService;

@RestController
@RequestMapping
@Slf4j
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/inscription")
    public void inscription(@RequestBody Utilisateur utilisateur){
        log.info("inscription faite");
        this.utilisateurService.inscription(utilisateur);

    }
}
