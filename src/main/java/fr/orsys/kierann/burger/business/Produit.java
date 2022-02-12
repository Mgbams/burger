package fr.orsys.kierann.burger.business;

public abstract class Produit {
	private Long id;

	private String nom;

	private int prixEnCentimes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrixEnCentimes() {
		return prixEnCentimes;
	}

	public void setPrixEnCentimes(int prixEnCentimes) {
		this.prixEnCentimes = prixEnCentimes;
	}
}
