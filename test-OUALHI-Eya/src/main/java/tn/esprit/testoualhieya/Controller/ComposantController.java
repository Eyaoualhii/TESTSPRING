package tn.esprit.testoualhieya.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.testoualhieya.DAO.Entities.Composant;
import tn.esprit.testoualhieya.DAO.Entities.Menu;
import tn.esprit.testoualhieya.Services.Composant.ComposantService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/composants")
public class ComposantController {
ComposantService composantService;
@PostMapping("/ajoutComposant/{idMenu}")
    public Menu ajoutComposantEtMiseAJourPrixTotalMenu(Set<Composant> composants,@PathVariable("idMenu") Long idMenu) {
        return composantService.ajoutComposantEtMiseAJourPrixTotalMenu(composants,idMenu);
    }

}
