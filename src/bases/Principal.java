package bases;

public class Principal
{
	
	public static void main(String[] args )
	{
		Principal.recherche("bonjour le chat et le chien", "ch");
		
	}
	
	/** EXERCICE 1 **/
	
	/**
	 * Retourne une description de la longueur d'une chaine.
	 * @param chaine
	 * @return Longueur de la chaine 
	 */
	public static String longueurDeChaine(String chaine)
	{
		return chaine.length() + " caractères";
	}
	
	/**
	 * Retourne la valeur maximale des deux valeurs entrées en paramètres
	 * @param firstInt
	 * @param secondInt
	 * @return Valeur max
	 */
	public static int maximum(int firstInt,int secondInt)
	{
		int res = (firstInt < secondInt) ? secondInt : firstInt;
		return res ;
	}
	
	/**
	 * Retourne une chaine de caractères de la même taille que la chaine de caractère en paramètre composé uniquement du caractère en paramètre.
	 * @param chaine
	 * @param carac
	 * @return haine de caractères
	 */
	public static String masquerLettres(String chaine,char carac) 
	{
		String res = "";
		for(int i = 0 ; i < chaine.length();i++) {
			res += carac;
		}
		return res;
	}

	/**
	 * Retourne True si la chaine en paramètre est un palindrome, False dans le cas contraire.
	 * @param chaine
	 * @return 
	 */
	public static boolean estUnPalindrome(String chaine)
	{
		boolean res = true;
		int fin = chaine.length()-1;
		int i = 0;
		while(i < fin && i != fin && res)
		{
			if (chaine.charAt(i) == chaine.charAt(fin))
			{
				i++;
				fin--;
			}
			else
			{
				res = false;
			}
		}
		return res ;
		
	}
	
	
	
	
	/** EXERCICE 2 **/
	
	
	public static int recherche(String chaine, String chaineRecherche)
	{
		int res = -1;
		int longueurChaine = chaine.length();
		int longueurRecherche = chaineRecherche.length();
		int i = 0;
		
		while (i < longueurChaine-longueurRecherche && res == -1)
		{
			if(chaineRecherche.equals(chaine.substring(i,i+longueurRecherche)))
			{
				res = i;
			}
			i++;
		}
		
		return res;
	}
	
}
