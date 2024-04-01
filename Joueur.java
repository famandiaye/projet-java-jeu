package modele;

public abstract class Joueur {
	public String nom;
	
	public Joueur(String nom) {
		this.nom = nom;
	}
	public void ajoueEn() {
		
	}
	abstract Position jouerCoup(Grille grille);
}
