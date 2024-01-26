package tn.esprit.testoualhieya.Services.Restaurant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testoualhieya.DAO.Entities.Menu;
import tn.esprit.testoualhieya.DAO.Entities.Restaurant;
import tn.esprit.testoualhieya.DAO.Repository.RestaurantRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class RestaurantService implements IRestaurantServuce{

    RestaurantRepository restaurantRepository;
    @Override
    public Restaurant ajouterRestaurantEtMenuAssocie(Restaurant restaurant) {
        List<Menu> m = restaurant.getMenusResto();
        restaurant.setMenusResto(m);
    return restaurantRepository.save(restaurant);
    }

}
