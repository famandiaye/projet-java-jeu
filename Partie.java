package modele;

public class Partie {
	private int grille;
	public String joueur1;
	public String joueur2;
	public String listC;
	public int scorsjoueur1;
	public int scorsjoueur2;
	
	public Partie(int grille,String joueur1,String joueur2,String listC,int scorsjoueur1,int scorsjoueur2) {
		
		this.grille = grille;
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
		this.listC = listC;
		this. scorsjoueur1 = scorsjoueur1;
		this. scorsjoueur2 = scorsjoueur2;
	}

	public  int getGrille() {
		return grille;
	}
}
