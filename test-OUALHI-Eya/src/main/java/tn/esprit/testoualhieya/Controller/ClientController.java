package tn.esprit.testoualhieya.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.testoualhieya.DAO.Entities.Client;
import tn.esprit.testoualhieya.Services.Client.ClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    ClientService clientService;

    @PostMapping
    public Client addClient(Client c) {
        return clientService.ajouterClient(c);

    }


}
