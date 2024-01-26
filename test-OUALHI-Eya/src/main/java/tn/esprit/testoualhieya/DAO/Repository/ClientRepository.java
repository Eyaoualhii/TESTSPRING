package tn.esprit.testoualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.testoualhieya.DAO.Entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {

    List<Client> findByIdentifiant(String identifiant);


}
