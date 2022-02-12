package fr.orsys.kierann.burger.business;

import java.util.List;

public class Commande {
	private Long id;
	
	//true : à emporter, false : sur place
	private boolean aEmporter;
	
	private Burger burger;
	private Accompagnement accompagnement;
	private Boisson boisson;
	
	private String remarques;
	
	private List<Sauce> sauces;
	
	private int prixEnCentimes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isaEmporter() {
		return aEmporter;
	}

	public void setAEmporter(boolean aEmporter) {
		this.aEmporter = aEmporter;
	}

	public Burger getBurger() {
		return burger;
	}

	public void setBurger(Burger burger) {
		this.burger = burger;
	}

	public Accompagnement getAccompagnement() {
		return accompagnement;
	}

	public void setAccompagnement(Accompagnement accompagnement) {
		this.accompagnement = accompagnement;
	}

	public Boisson getBoisson() {
		return boisson;
	}

	public void setBoisson(Boisson boisson) {
		this.boisson = boisson;
	}

	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

	public List<Sauce> getSauces() {
		return sauces;
	}

	public void setSauces(List<Sauce> sauces) {
		this.sauces = sauces;
	}

	public int getPrixEnCentimes() {
		return prixEnCentimes;
	}

	public void setPrixEnCentimes(int prixEnCentimes) {
		this.prixEnCentimes = prixEnCentimes;
	}
	
	
}
