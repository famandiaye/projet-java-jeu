package modele;


public class Coup {
	private Joueur joueurCoup;
	private Position positionCase;
	private Orientation orientation; 
	
	
 public Coup(Joueur joueurCoup, Position positionCase, Orientation orientation) {
		this.joueurCoup = joueurCoup;
		this.positionCase = positionCase;
		this.orientation = orientation;
	}
 
 
 
}


