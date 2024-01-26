package tn.esprit.testoualhieya.Services.Composant;

import tn.esprit.testoualhieya.DAO.Entities.Composant;
import tn.esprit.testoualhieya.DAO.Entities.Menu;

import java.util.Set;

public interface IComposantService {

    Menu ajoutComposantEtMiseAJourPrixTotalMenu(Set<Composant> composants, Long idMenu);
}
