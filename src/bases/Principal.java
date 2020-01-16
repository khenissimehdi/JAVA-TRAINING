package bases;

public class Principal
{
	
	public static void main(String[] args )
	{
		String prenom = "charles";
		int longueur = prenom.length();
		System.out.print(prenom);
		System.out.print(" (" + Principal.longueurDeChaine(prenom) +" caractères)");	
	}
	
	
	/**
	 * Retourne une description de la longueur d'une chaine.
	 * @param chaine
	 * @return Longueur de la chaine 
	 */
	public static String longueurDeChaine(String chaine) {
		return chaine.length() + " caractères";
	}
	
	/**
	 * Retourne la valeur maximale des deux valeurs entrées en paramètres
	 * @param firstInt
	 * @param secondInt
	 * @return Valeur max
	 */
	public static int maximum(int firstInt,int secondInt) {
		int res = (firstInt < secondInt) ? secondInt : firstInt;
		return res ;
	}
	
	/**
	 * Retourne une chaine de caractères de la même taille que la chaine de caractère en paramètre composé uniquement du caractère en paramètre.
	 * @param chaine
	 * @param carac
	 * @return haine de caractères
	 */
	public static String masquerLettres(String chaine,char carac) {
		String res = "";
		for(int i = 0 ; i < chaine.length();i++) {
			res += carac;
		}
		return res;
	}

	
	
}
