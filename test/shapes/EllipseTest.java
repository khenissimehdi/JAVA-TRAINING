package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EllipseTest {

	
	@Test
	void testPerimeter() {
		Ellipse E = new Ellipse(4,2);
		assertEquals(19.869177,E.getPerimeter(),0.00001);
	}
	
	
	@Test
	void testSurface() {
		Ellipse E = new Ellipse(4,2);
		assertEquals(25.13274,E.getSurface(),0.00001);
	}

	
}
