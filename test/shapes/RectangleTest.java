package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	
	@Test
	void testPerimeter() {
		Rectangle R = new Rectangle(4,2);
		assertEquals(12,R.getPerimeter());
	}
	
	
	@Test
	void testSurface() {
		Rectangle R = new Rectangle(4,2);
		assertEquals(8,R.getSurface());
	}
	
	
}
