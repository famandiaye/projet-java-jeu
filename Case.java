package modele;


	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.List;
	public class Case {
	  
	 //declaration des attribut
		private int valeur;
		private  Joueur jouePar;
		private Position position;
		private boolean selected;
		private int ligne;
		private int column;
		private int nbCase;
		//le constructeur
	 
		public Case(int valeur, Joueur jouePar, Position position, boolean selected, int ligne, int column,int numeroCase) {
			super();
			this.valeur = valeur;
			this.jouePar = jouePar;
			this.position = position;
			this.selected = selected;
			this.ligne = ligne;
			this.column = column;
			this.nbCase = nbCase;
		}
		
	 
		public int choiceCase() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("entrez le numero de la ligne ou de la colonne");
			int choice = scanner.nextInt();
			if(ligne < 0 || ligne >=nbCase){
			
			System.out.println("l'indice de ligne est invalide");
			
			
			}

		
		
		  if(column <0 || column >= nbCase) {
		    	ArrayList<Case> colonne = new ArrayList<>();
		        List<Case>[] cases = null;
				for (List<Case> ligne : cases) {
		            colonne.add(ligne.get(column));
		        }
		        return column;
		    }
		return choice;
		
	}
		}
