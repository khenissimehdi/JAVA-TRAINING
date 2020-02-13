package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {


	@Test
	void testPerimeter() {
		Triangle T = new Triangle(7);
		assertEquals(21,T.getPerimeter());
	}
	
	
	@Test
	void testSurface() {
		Triangle T = new Triangle(7);
		assertEquals(21.218,T.getSurface(),0.001);
	}
	

}