package modele;


	import java.util.LinkedList;

	public class AlignementCase {


		private Orientation orientation;
		private   Case cases;
		private int position;
		private Case Case;
		
		public  AlignementCase(Orientation orientation, Case Cases, int position) {
			this.orientation = orientation;
			this.Case = Cases;
			this.position = position;
		}
		// Méthode pour ajouter une case à l'alignement
	    public void ajouterCase(Case c) {
	        LinkedList<modele.Case> Cases = null;
			Cases.add(c);
	    }

		public Orientation getOrientation() {
			return orientation;
		}

		public LinkedList<Case> getLesCases() {
			return getLesCases();
			
		}
			public int getPosition() {
				return position;
			}
		}

