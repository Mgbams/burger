package fr.orsys.kierann.burger.services;

import java.util.List;
import java.util.Vector;

import fr.orsys.kierann.burger.business.Sauce;

public class SauceService {
	private static List<Sauce> sauces = new Vector<Sauce>();

	public Sauce ajouterSauce(String nom, int prixEnCentimes) {
		Sauce sauce = new Sauce();
		sauce.setId((long) sauces.size());
		sauce.setNom(nom);
		sauce.setPrixEnCentimes(prixEnCentimes);
		sauces.add(sauce);
		return sauce;
	}

	public List<Sauce> recupererSauces() {
		return sauces;
	}
}
