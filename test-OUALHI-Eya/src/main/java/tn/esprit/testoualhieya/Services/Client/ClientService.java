package tn.esprit.testoualhieya.Services.Client;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testoualhieya.DAO.Entities.Client;
import tn.esprit.testoualhieya.DAO.Entities.Menu;
import tn.esprit.testoualhieya.DAO.Repository.ClientRepository;
import tn.esprit.testoualhieya.DAO.Repository.MenuRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{

    MenuRepository menuRepository;
    ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void AffecterClientAuMenu(String identifiant, String libelleMenu) {
//        List<Client> client = clientRepository.findByIdentifiant(identifiant);
//        List<Menu> menu = menuRepository.findByLibelleMenu(libelleMenu);
//        client.getMenus().add(menu);
//        menu.getClients().add(client);
//        clientRepository.save(client);
    }
}
