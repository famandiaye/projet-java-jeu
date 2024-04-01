

public class Test {

	    

		public static  void main(String[] args) {
	        // Initialisation de la grille
	        int tailleGrille = 4; 
	        Grille grille = new Grille(tailleGrille);

	        // Initialisation des joueurs
	        JoueurHumain joueur1 = new JoueurHumain("Joueur 1", null);
	        JoueurOrdinateur joueur2 = new JoueurOrdinateur("Joueur 2", null, tailleGrille, tailleGrille);

	        // Initialisation de la partie
	        Test partie = new Test();

	        // Boucle de jeu
	        while (true) {
	            // Joueur 1 joue
	            Position coupJoueur1 = joueur1.jouerCoup(grille);
	            if (coupJoueur1 != null) {
	               
	                
	            }

	          

	            // Joueur 2 joue
	            Position coupJoueur2 = joueur2.jouerCoup(grille);
	            if (coupJoueur2 != null) {
	                
	                
	            }

	         
	        }
	    }
	}
	            
	            
	            
	            