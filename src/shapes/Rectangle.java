package shapes;

public class Rectangle extends Shape {
	
	
	private int width, height;

	
	/**
	 * Constructeur de la classe
	 * @param width Entier
	 * @param height Entier
	 */
	public Rectangle(int _width, int _height)
	{
		this.width = _width;
		this.height = _height;
	}
	
	
	/**
	 * Méthode permettant de déssiner une figure.
	 */
	@Override
	public void draw()
	{
		StringBuilder res = new StringBuilder();
		for(int y = 0; y < this.height; y++)
		{
			// Filled
			if (this.isFilled()) {
				for(int x = 0; x < this.width; x++)
				{
					res.append(this.getPen());
				}
			}
			// Not filled
			else {
				res.append(this.getPen());
				for(int x = 1; x < this.width-1; x++)
				{
					if (y == 0 || y == this.height-1)
						res.append(this.getPen());
					else
						res.append(' ');
				}
				res.append(this.getPen());
				
			}
			res.append('\n');
		}
		System.out.println(res);
	}
	
	
}
