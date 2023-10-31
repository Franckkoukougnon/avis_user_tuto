package tech.franck.avisutilisateurs.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import tech.franck.avisutilisateurs.enums.TypeDeRole;
import tech.franck.avisutilisateurs.model.Role;
import tech.franck.avisutilisateurs.model.Utilisateur;
import tech.franck.avisutilisateurs.repository.UtilisateurRepo;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepo utilisateurRepo;

    @Autowired
    private BCryptPasswordEncoder bcryptPasswordEncoder;

    public void inscription(Utilisateur utilisateur){

        //methode pour verifier si email est correct
        if(utilisateur.getEmail().indexOf("@") == -1){
            throw new RuntimeException("Votre mail est invalide ");
        }
        if(utilisateur.getEmail().indexOf(".") == -1){
            throw new RuntimeException("Votre mail est invalide ");
        }

        // Methode pour attribuer un role au User
        Role roleUtilisateur = new Role();
        roleUtilisateur.setLibelle(TypeDeRole.UTILISATEUR);
        utilisateur.setRole(roleUtilisateur);


        // Methode pour crytper mot de passe
        String mdpCrypte =   this.bcryptPasswordEncoder.encode(utilisateur.getPassword());
        utilisateur.setMdp(mdpCrypte);
        this.utilisateurRepo.save(utilisateur);
    }
}
