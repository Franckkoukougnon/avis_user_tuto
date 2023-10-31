package tech.franck.avisutilisateurs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.franck.avisutilisateurs.model.Utilisateur;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Integer> {
}
