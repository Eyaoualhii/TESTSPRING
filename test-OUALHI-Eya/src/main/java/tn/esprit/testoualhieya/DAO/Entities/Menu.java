package tn.esprit.testoualhieya.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Menu {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMenu;

    private String libelleMenu;

    private TypeMenu typeMenu;

    private  float prixTotal;

    @ManyToMany(mappedBy = "menus")
    List<Client> clients;

    @OneToMany(mappedBy = "menu")
    List<Composant> composants;
}
