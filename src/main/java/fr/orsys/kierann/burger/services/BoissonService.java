package fr.orsys.kierann.burger.services;

import java.util.List;
import java.util.Vector;

import fr.orsys.kierann.burger.business.Boisson;

public class BoissonService {
	private static List<Boisson> boissons = new Vector<Boisson>();

	public Boisson ajouterBoisson(String nom, int prixEnCentimes) {
		Boisson boisson = new Boisson();
		boisson.setId((long) boissons.size());
		boisson.setNom(nom);
		boisson.setPrixEnCentimes(prixEnCentimes);
		boissons.add(boisson);
		return boisson;
	}

	public List<Boisson> recupererBoissons() {
		return boissons;
	}
}
