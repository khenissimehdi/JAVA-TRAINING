package shapes;

public class Ellipse extends AbstractShape{

	
	private double a, b;
	
	
	/**
	 * Constructeur classe
	 * @param a
	 * @param b
	 */
	public Ellipse(double a, double b) {
		this.a = a;
		this.b = b;
	}

	
	/*
	 * Calcul du périmètre
	 */
	@Override
	public double getPerimeter() {
		double res = 2 * Math.PI * Math.sqrt( (Math.pow(this.a,2) + Math.pow(this.b,2)) / 2 );
		return res;
	}

	
	/*
	 * Calcul de la surface
	 */
	@Override
	public double getSurface() {
		double res = Math.PI * this.a * this.b;
		return res;
	}
	
	
	/**
	 * Méthode permettant de déssiner une figure.
	 */
	@Override
	public void draw()
	{
		
	}
	
	
}
