package tn.esprit.testoualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.testoualhieya.DAO.Entities.Client;
import tn.esprit.testoualhieya.DAO.Entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {



}
