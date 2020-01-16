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
	 * @return longueur de la chaine 
	 */
	public static String longueurDeChaine(String chaine) {
		return chaine.length() + " caractères";
	}
	
	public static int maximum(int firstInt,int secondInt) {
		int res = (firstInt < secondInt) ? secondInt : firstInt;
		return res ;
	}

}
