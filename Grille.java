
class Grille {
	public int i;
	public int j;
     tab = new int[n][n];

    public Position choisirCaseMaxValeur() {
        Position positionMaxValeur = null;
        int maxValeur = Integer.MIN_VALUE;

        // Parcourir la grille pour trouver la case ayant la plus grande valeur
        int n;
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int[][] tab;
				if (tab[i][j] > maxValeur) {
                    maxValeur = tab[i][j];
                    positionMaxValeur = new Position();
                }
            }
        }

        return positionMaxValeur;
    }
}