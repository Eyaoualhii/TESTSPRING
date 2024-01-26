package tn.esprit.testoualhieya.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Composant {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComposant;

    private String nomComposant;

    private  float prix;

    @ManyToOne
    Menu menu;
}
