package modele;

public class JoueurOrdinateur extends Joueur{
	public String typeDeJeu;
	public int niveau;
	

	public JoueurOrdinateur(String nom, String typeDeJeu, int niveau, int strategie) {
		super(nom);
		this.typeDeJeu = typeDeJeu;
		this.niveau = niveau;

	}

	@Override
	public
	Position jouerCoup(Grille grille) {
		// TODO Auto-generated method stub
		return null;
	}

}
	
}
