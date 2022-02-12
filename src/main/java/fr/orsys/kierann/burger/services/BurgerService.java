package fr.orsys.kierann.burger.services;

import java.util.List;
import java.util.Vector;

import fr.orsys.kierann.burger.business.Burger;

public class BurgerService {
	private static List<Burger> burgers = new Vector<Burger>();

	public Burger ajouterBurger(String nom, int prixEnCentimes) {
		Burger burger = new Burger();
		burger.setId((long) burgers.size());
		burger.setNom(nom);
		burger.setPrixEnCentimes(prixEnCentimes);
		burgers.add(burger);
		return burger;
	}

	public List<Burger> recupererBurgers() {
		return burgers;
	}
}
