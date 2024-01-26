package tn.esprit.testoualhieya.Services.Client;

import tn.esprit.testoualhieya.DAO.Entities.Client;

import java.util.List;

public interface IClientService {
     Client ajouterClient(Client client);

     void AffecterClientAuMenu(String identifiant, String libelleMenu);

}
