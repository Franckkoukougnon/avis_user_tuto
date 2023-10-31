package tech.franck.avisutilisateurs.repository;

import org.springframework.data.repository.CrudRepository;
import tech.franck.avisutilisateurs.model.Avis;

public interface AvisRepository extends CrudRepository<Avis, Integer> {
}
