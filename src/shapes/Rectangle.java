package shapes;

public class Rectangle {
	
	private int width, height;
	private char pen = '#';
	private boolean filled = false;
	
	
	/**
	 * Constructeur de la classe Rectangle
	 * @param width Entier
	 * @param height Entier
	 */
	public Rectangle(int _width, int _height)
	{
		this.width = _width;
		this.height = _height;
	}
	
	
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
	 * Modificateur attribut Filled
	 * @param _filled Boolean
	 */
	public void setFilled(boolean _filled)
	{
		this.filled = _filled;
	}
	
	
	/**
	 * Méthode permettant de déssiner une figure.
	 */
	public void draw()
	{
		StringBuilder res = new StringBuilder();
		for(int y = 0; y < this.height; y++)
		{
			// Filled
			if (this.filled) {
				for(int x = 0; x < this.width; x++)
				{
					res.append(this.pen);
				}
			}
			// Not filled
			else {
				res.append(this.pen);
				for(int x = 1; x < this.width-1; x++)
				{
					if (y == 0 || y == this.height-1)
						res.append(this.pen);
					else
						res.append(' ');
				}
				res.append(this.pen);
				
			}
			res.append('\n');
		}
		System.out.println(res);
	}
	
	
}
