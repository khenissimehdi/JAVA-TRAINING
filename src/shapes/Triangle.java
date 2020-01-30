package shapes;

public class Triangle {

	private int size;
	private char pen = '#';
	private boolean filled = false;
	
	
	/**
	 * Constructeur classe Triangle
	 * @param _size
	 */
	public Triangle (int _size)
	{
		this.size = _size;
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
	public void setPen(char _pen)
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
		for(int y = 0; y < this.size; y++)
		{
			
			if(filled)
			{
				for(int x = 0; x < y+1; x++)
				{
					res.append(this.pen);
				}
			}
			else
			{
				if (y != 0)
					res.append(this.pen);
				for(int x = 1; x < y; x++)
				{
					if (y < 1 || y == this.size-1)
					{
						res.append(this.pen);
					}
					else
					{
						res.append(' ');
					}
				}
				res.append(this.pen);
			}
			
			res.append('\n');
		}
		System.out.println(res);
	}

}
