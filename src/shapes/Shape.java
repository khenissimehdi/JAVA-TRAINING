package shapes;

public abstract class Shape {

	
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
	
	public abstract double getPerimeter();
	
	public abstract double getSurface();
	
	public abstract void draw();
	
}
