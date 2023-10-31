package tech.franck.avisutilisateurs.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "avis")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String message;

    private String statut;

}
