package shapes;

public class Shape {

	
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
	 * @param _pen Char
	 */
	public void setPen (char _pen)
	{
		this.pen = _pen;
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
	 * @param _filled Boolean
	 */
	public void setFilled(boolean _filled)
	{
		this.filled = _filled;
	}
	
	public void draw() {}
	
}
