package tn.esprit.testoualhieya.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRestaurant;

    private String nom;

    private long nbPlacesMax;

    @OneToMany
    List<Menu> menusResto;
}
