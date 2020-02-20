package shapes;

public interface Shape extends Comparable<Shape>{

	double getPerimeter();

	double getSurface();

	void draw();

}