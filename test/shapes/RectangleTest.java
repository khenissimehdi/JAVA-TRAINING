package shapes;

import static org.junit.jupiter.api.Assertions.*;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

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
	
	
	@Test
	void testMax() {
		TreeSet < Shape > listR = new TreeSet < > ();
		Rectangle R1 = new Rectangle(40,20);
		listR.add(R1);
		Rectangle R2 = new Rectangle(4,2);
		listR.add(R2);
		Rectangle R3 = new Rectangle(400,200);
		listR.add(R3);
		Rectangle R4 = new Rectangle(2,1);
		listR.add(R4);
		assertEquals(R3,Collections.max(listR));
	}
	
	@Test
	void testBinarySearch() {
		ArrayList < Shape > listR = new ArrayList < > ();
		Rectangle R1 = new Rectangle(40,20);
		listR.add(R1);
		Rectangle R2 = new Rectangle(4,2);
		listR.add(R2);
		Rectangle R3 = new Rectangle(400,200);
		listR.add(R3);
		Rectangle R4 = new Rectangle(2,1);
		listR.add(R4);
		
		Collections.sort(listR);
		
		assertEquals(0,Collections.binarySearch(listR,R4));
		assertEquals(1,Collections.binarySearch(listR,R2));
		assertEquals(2,Collections.binarySearch(listR,R1));
		assertEquals(3,Collections.binarySearch(listR,R3));
	}
	
}
