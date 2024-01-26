package tn.esprit.testoualhieya.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantClient")
    private long idClient;


    private String identifiant;

    private LocalDate datePremiereVisite;

    @ManyToMany
    List<Menu> menus;
}
