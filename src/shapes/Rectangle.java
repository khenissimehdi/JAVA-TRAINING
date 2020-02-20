package shapes;

public class Rectangle extends AbstractShape {
	
	
	private int width, height;

	
	/**
	 * Constructeur de la classe
	 * @param width Entier
	 * @param height Entier
	 */
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	
	/*
	 * Calcul du périmètre
	 */
	@Override
	public double getPerimeter() {
		double res = 2 * (this.height + this.width);
		return res;
		
	}
	

	
	/*
	 * Calcul de la surface
	 */
	@Override
	public double getSurface() {
		double res = this.height * this.width;
		return res;
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
