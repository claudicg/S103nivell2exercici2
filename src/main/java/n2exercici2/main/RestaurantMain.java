package n2exercici2.main;

import n2exercici2.handlers.RestaurantHandler;

public class RestaurantMain {

	public static void main(String[] args) {
		
		RestaurantHandler demo = new RestaurantHandler();
		
		//Ordenat usant una llista.
		demo.ordenarImprimirRestaurantsList();
		
		System.out.println();
		
		//Ordenat usant un TreeSet.
		demo.ordenarImprimirRestaurantsTreeSet();
	}	
}
