package tn.esprit.testoualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testoualhieya.DAO.Entities.Composant;
import tn.esprit.testoualhieya.DAO.Entities.Menu;
import tn.esprit.testoualhieya.DAO.Entities.Restaurant;

import java.util.Set;

public interface ComposantRepository extends JpaRepository<Composant,Long> {


}
