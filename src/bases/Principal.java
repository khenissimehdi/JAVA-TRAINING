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
	
	public static String longueurDeChaine(String chaine) {
		return chaine.length() + " caractères";
	}

}
