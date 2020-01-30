package chess;

public class Position {
	
	private int x,y;
	
	/**
	 * Constructeur par défaut classe position
	 */
	public Position() {
		this.x=0;
		this.y=0;
	}
	
	/**
	 * Constructeur de la clase position
	 * @param x Axe X
	 * @param y Axe Y
	 * @throws IllegalArgumentException
	 */
	public Position(int x , int y ) throws IllegalArgumentException
	{
		if (x<0 || x>7 || y<0 || y>7)
		{
			throw new IllegalArgumentException("Position invalide : " + x + "," + y);
		}
		this.x=x;
		this.y=y;
	}
	
	public Position(String algebraicNotation) {
		char pos1 = algebraicNotation.charAt(0);
		int pos2 = (int) algebraicNotation.charAt(1);
		
		if (algebraicNotation.length() > 2 || algebraicNotation.length() < 0)
		{
			throw new IllegalArgumentException("La chaine de caractères ne possèdent pas deux caractères");
		}
		
		if (pos1 < 'A' && pos1 > 'H')
		{
			throw new IllegalArgumentException("Le premier caractère (" + algebraicNotation.charAt(0) + ") n'est pas comprit entre A et H");
		}
		
		if (pos2 < 0)
		{
			throw new IllegalArgumentException("Le deuxième caractère (" + algebraicNotation.charAt(1) + ") est inférieur à 0");
		}
		else if (pos2 > 8)
		{
			throw new IllegalArgumentException("Le deuxième caractère (" + algebraicNotation.charAt(1) + ") est supérieur à 8");
		}
	}
	
	/**
	 * Accesseur attribut X
	 * @return
	 */
	public int getX() {
		return this.x;
	}
	

	/**
	 * Méthode modifiant l'affichage d'un objet de la classe
	 */
	@Override
	public String toString() {
		return "(" + this.x + " , " + this.y + ")"; 
	}
	
	/**
	 * Méthode générant le HashCode en fonction de la méthode equals() ci-dessous
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	/**
	 * Méthode de comparaison avec un abjet
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	
	

}
