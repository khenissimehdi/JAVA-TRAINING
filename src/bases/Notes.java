package bases;

public class Notes {
	
	
	public static void main(String[] args )
	{
		double[] tab = genererTableauDeNotes(10);
		
		
		int ind = 0;
		for(double n : tab) {
			System.out.println("Indice " + ind + " du tableau : " + n);
			ind ++;
		}
		System.out.println(" ");
		
	}
	
	
	/**
	 * Méthode qui retourne un tableau de double géneré aléatoirement (avec des valeurs comprises entre 0 et 20)
	 * @param capacite nombre d'élements dans le tableau
	 * @return tableau de double
	 */
	public static double[] genererTableauDeNotes(int capacite)
	{
		double[] res;
		res = new double[capacite];
		for (int i = 0; i < res.length; i++)
		{
			res[i] = Math.random() * 20;
		}
		
		return res;
	}

	
	/**
	 * Méthode qui teste si le tableau de double passé en paramètre (tab2) possède un élément supérieur au double en paramètre (value)
	 * @param tab2 tableau de double
	 * @param value double à comparer
	 * @return nombre d'élement supérieur au paramètre 'value' dans le tableau (tab2)
	 */
	public static int nombresDeNotesSuperieuresA(double[] tab2, double value)
	{
		int res = 0;
		for (int i = 0; i < tab2.length; i++)
		{
			res = (tab2[i] > value) ? res+1 : res ;
		}
		
		return res;
	}
	
	
	/**
	 * Méthode qui renvoie le double le plus petit du tableau de double passé en pamètres (tab3)
	 * @param tab3 tableau de double
	 * @return double le plus grand au sein du tableau de double
	 */
	public static double minimum(double[] tab3)
	{
		double res = tab3[0];
		for (double i : tab3)
		{
			res = (i < res) ? i : res;
		}
		return res;	
	}
	
	
	/**
	 * Méthode qui renvoie le double le plus grand du tableau de double passé en pamètres (tab3)
	 * @param tab3 tableau de double
	 * @return double le plus grand au sein du tableau de double
	 */
	public static double maximum(double[] tab3)
	{
		double res = tab3[0];
		for (double i : tab3)
		{
			res = (i > res) ? i : res;
		}
		return res;	
	}
	
	
	/**
	 * Méthode qui renvoie la moyenne des valeurs du tableau de double mit en pamètres
	 * @param tab3 tableau de double
	 * @return double moyenne des valeurs du tableau de double
	 */
	public static double moyenne(double[] tab3)
	{
		double res = 0;
		for (double i : tab3)
		{
			res += i;
		}
		return res/tab3.length;	
	}

	
	/**
	 * Méthode
	 * @param chaine
	 * @return
	 */
	public static int variete(String chaine)
	{
		boolean[] memo = new boolean[26];
		int res = 0 ;
		
		for(int  i = 0 ; i <chaine.length();i++) {
			char c = chaine.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				memo[c - 'A'] = true;
				
			}
			else if(c >= 'a' && c <= 'z') {
				memo[c - 'a'] = true;
			}
		}
		
		for(boolean n : memo) {
			if(n) {
				res++;
			}
			
		}
		return res ; 
		
	}
	
	
	/*
	public static int[] histogrammeDesVarietes()
	{
		
	}
	*/
	
}
