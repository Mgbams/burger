package fr.orsys.kierann.burger.services;

import java.util.List;
import java.util.Vector;

import fr.orsys.kierann.burger.business.Accompagnement;
import fr.orsys.kierann.burger.business.Boisson;
import fr.orsys.kierann.burger.business.Burger;
import fr.orsys.kierann.burger.business.Commande;
import fr.orsys.kierann.burger.business.Sauce;

public class CommandeService {
	private static List<Commande> commandes = new Vector<Commande>();

	public Commande ajouterCommande(boolean aEmporter, Burger burger, Accompagnement accompagnement, Boisson boisson,
			String remarques, List<Sauce> sauces) {
		Commande commande = new Commande();
		commande.setId((long) commandes.size());
		commande.setAEmporter(aEmporter);
		commande.setBurger(burger);
		commande.setAccompagnement(accompagnement);
		commande.setBoisson(boisson);
		commande.setRemarques(remarques);
		commande.setSauces(sauces);
		commandes.add(commande);
		return commande;
	}
	
	public Commande recupererCommande(Long id) {
		for (Commande commande : commandes) {
			if (commande.getId() == id) {
				return commande;
			}
		}
		return null;
	}
	
	public List<Commande> recupererCommandes() {
		return commandes;
	}
}
