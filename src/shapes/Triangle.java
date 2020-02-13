package shapes;

public class Triangle extends Shape{
	
	
	private int size;
	
	
	/**
	 * Constructeur classe Triangle
	 * @param _size
	 */
	public Triangle (int _size)
	{
		this.size = _size;
	}
	
	
	/**
	 * Méthode permettant de déssiner une figure.
	 */
	@Override
	public void draw()
	{
		StringBuilder res = new StringBuilder();
		for(int y = 0; y < this.size; y++)
		{
			
			if(this.isFilled())
			{
				for(int x = 0; x < y+1; x++)
				{
					res.append(this.getPen());
				}
			}
			else
			{
				if (y != 0)
					res.append(this.getPen());
				for(int x = 1; x < y; x++)
				{
					if (y < 1 || y == this.size-1)
					{
						res.append(this.getPen());
					}
					else
					{
						res.append(' ');
					}
				}
				res.append(this.getPen());
			}
			
			res.append('\n');
		}
		System.out.println(res);
	}

}
