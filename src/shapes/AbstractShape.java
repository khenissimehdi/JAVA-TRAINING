package shapes;

public abstract class AbstractShape implements Shape {

	
	private char pen = '#';
	private boolean filled = false;
	
	
	/**
	 * Accesseur attribut pen
	 */
	public char getPen()
	{
		return this.pen;
	}
	
	
	/**
	 * Modificateur attribut pen
	 * @param pen Char
	 */
	public void setPen (char pen)
	{
		this.pen = pen;
	}
	
	
	/**
	 * Accesseur attribut filled
	 */
	public boolean isFilled()
	{
		return this.filled;
	}
	
	
	/**
	 * Modificateur attribut filled
	 * @param filled Boolean
	 */
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	
	/**
	 * Méthode modifiant l'affichage d'un objet de la classe
	 */
	public String toString() {
		return "Type : " + this.getClass().getSimpleName() + " / Périmètre : " + this.getPerimeter() + " / Surface : " + this.getSurface(); 
	}
	
	
	@Override
	public abstract double getPerimeter();
	
	@Override
	public abstract double getSurface();
	
	@Override
	public abstract void draw();
	
}
