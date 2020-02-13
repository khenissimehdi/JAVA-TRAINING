package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {


	@Test
	void testPerimeter() {
		Square S = new Square(4);
		assertEquals(16,S.getPerimeter());
	}
	
	
	@Test
	void testSurface() {
		Square S = new Square(4);
		assertEquals(16,S.getSurface());
	}
	

}
