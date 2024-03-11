package n2exercici2.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import n2exercici2.beans.Restaurant;

public class RestaurantHandler {

	private  static Set<Restaurant> restaurantsSet = new HashSet<>();
	
	private void crearIAfegirRestaurants() {
		
		Restaurant restaurant1 = new Restaurant("La salita", 10);
		Restaurant restaurant2 = new Restaurant("Gresca", 9);	
		Restaurant restaurant3 = new Restaurant("Per Feina", 8);
		Restaurant restaurant4 = new Restaurant("Granja Elena", 9);
		Restaurant restaurant5 = new Restaurant("L'Olivé", 7);
		Restaurant restaurant6 = new Restaurant("L'Olivé", 8);
		
		restaurant1.guardarRestaurant(restaurantsSet);
		restaurant2.guardarRestaurant(restaurantsSet);
		restaurant3.guardarRestaurant(restaurantsSet);
		restaurant4.guardarRestaurant(restaurantsSet);
		restaurant5.guardarRestaurant(restaurantsSet);
		restaurant6.guardarRestaurant(restaurantsSet);
	}
	
	public void ordenarImprimirRestaurantsTreeSet() {
		
		crearIAfegirRestaurants();
		
		TreeSet<Restaurant>	restaurantsTree = new TreeSet<Restaurant>(Comparator.comparing((Restaurant rest)
				->rest.getNom()).thenComparing((Restaurant rest)-> rest.getPuntuacio())); 
		
		restaurantsTree.addAll(restaurantsSet);
		
		for(Restaurant item : restaurantsTree) {
			System.out.println(item.getNom() + " " + item.getPuntuacio());
		}	
	}
	
	public void ordenarImprimirRestaurantsList() {
		
		crearIAfegirRestaurants();

		List<Restaurant> llistaRestaurants = new ArrayList<>(restaurantsSet);
		
		Collections.sort(llistaRestaurants);
		
		for(Restaurant item : llistaRestaurants) {
			System.out.println(item.getNom() + " " + item.getPuntuacio());
		}	
	}
}
