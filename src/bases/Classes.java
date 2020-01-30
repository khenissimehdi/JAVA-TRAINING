package bases;

import shapes.Rectangle;
import shapes.Triangle;

public class Classes {
	
	public static void main(String[] args )
	{
		//testRectangle();
		testTriangle();
	}
	
	private static void testRectangle()
	{
		Rectangle test = new Rectangle(5,4);
		
		System.out.println(test.getPen());
		test.setPen('$');
		System.out.println(test.getPen());
		System.out.println("");
		
		System.out.println(test.isFilled());
		test.setFilled(false);
		System.out.println(test.isFilled());
		System.out.println("");
		
		test.draw();
	}

	private static void testTriangle()
	{
		Triangle test = new Triangle(5);
		
		System.out.println(test.getPen());
		test.setPen('$');
		System.out.println(test.getPen());
		System.out.println("");
		
		System.out.println(test.isFilled());
		test.setFilled(false);
		System.out.println(test.isFilled());
		System.out.println("");
		
		test.draw();
	}

}
