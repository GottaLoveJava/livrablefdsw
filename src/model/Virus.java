package model;

public class Virus {
	
	private String nom;
	private String famille;
	
	public Virus(String nom, String famille) {
		super();
		this.nom = nom;
		this.famille = famille;
	}

	public Virus(String nom) {
		super();
		this.nom = nom;
	}
	
	public Virus() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}
	
	
	
}
