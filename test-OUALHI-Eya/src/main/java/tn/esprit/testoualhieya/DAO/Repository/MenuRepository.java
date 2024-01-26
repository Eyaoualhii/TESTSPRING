package tn.esprit.testoualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testoualhieya.DAO.Entities.Composant;
import tn.esprit.testoualhieya.DAO.Entities.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    List<Menu> findByLibelleMenu(String libelleMenu);
}
