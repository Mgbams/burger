package fr.orsys.kierann.burger.services;

import java.util.List;
import java.util.Vector;

import fr.orsys.kierann.burger.business.Accompagnement;

public class AccompagnementService {
	private static List<Accompagnement> accompagnements = new Vector<Accompagnement>();

	public Accompagnement ajouterAccompagnement(String nom, int prixEnCentimes) {
		Accompagnement accompagnement = new Accompagnement();
		accompagnement.setId((long) accompagnements.size());
		accompagnement.setNom(nom);
		accompagnement.setPrixEnCentimes(prixEnCentimes);
		accompagnements.add(accompagnement);
		return accompagnement;
	}

	public List<Accompagnement> recupererAccompagnements() {
		return accompagnements;
	}
}
