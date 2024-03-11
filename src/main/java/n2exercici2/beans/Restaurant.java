package n2exercici2.beans;

import java.util.Objects;
import java.util.Set;

public class Restaurant implements Comparable<Restaurant>{

	private String nom = "";
	private int puntuacio = 0;
	

	public Restaurant(String nom, int puntuacio) {
		super();
		this.nom = nom;
		this.puntuacio = puntuacio;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	private boolean existeixRestaurante(Set<Restaurant> restaurantesSet) {
		
		boolean existe = false;
		
		if(restaurantesSet.contains(this)) {
			existe = true;
		}
		return existe;
	}
	
	public String guardarRestaurant(Set<Restaurant> restaurantesSet) {
		
		String resultado = "";
		if(existeixRestaurante(restaurantesSet)) {
			resultado = "El restaurante ya existe. No se puede guardar.";
		}else {
			restaurantesSet.add(this);
			resultado = "El restaurante se ha guardado correctamente.";
		}
		return resultado;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
	}


	@Override
	public String toString() {
		return "Restaurant [nom=" + nom + ", puntuacio=" + puntuacio + "]";
	}


	@Override
	public int compareTo(Restaurant altreRestaurant) {
		
		if(!this.getNom().equalsIgnoreCase(altreRestaurant.getNom())) {
			return this.getNom().compareTo(altreRestaurant.getNom());
		}
		return getPuntuacio() - altreRestaurant.getPuntuacio();
	}
	
}
