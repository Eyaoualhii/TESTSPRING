package tn.esprit.testoualhieya.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.testoualhieya.DAO.Entities.Restaurant;
import tn.esprit.testoualhieya.Services.Restaurant.RestaurantService;

@RestController
@AllArgsConstructor
@RequestMapping("/restaurants")
public class RestaurantController {

    RestaurantService restaurantService;
@PostMapping("/ajoutRestaurant")
    public Restaurant ajouterRestaurantEtMenuAssocie(Restaurant restaurant) {
        return  restaurantService.ajouterRestaurantEtMenuAssocie(restaurant);
    }
}
