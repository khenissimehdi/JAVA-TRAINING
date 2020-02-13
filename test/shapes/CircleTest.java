package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	
	@Test
	void testPerimeter() {
		Circle C = new Circle(4);
		assertEquals(25.13274,C.getPerimeter(),0.00001);
	}
	
	
	@Test
	void testSurface() {
		Circle C = new Circle(4);
		assertEquals(50.26548,C.getSurface(),0.00001);
	}
	

}
