package bases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test public void maximum_equal() {
		assertEquals(1,Principal.maximum(1,1));
	}

	@Test public void maximum_firstInt() {
		assertEquals(3,Principal.maximum(3,1));
	}
	
	@Test public void maximum_secondInt() {
		assertEquals(3,Principal.maximum(1,3));
	}
	
	
	@Test public void masquerLettres_five() {
		assertEquals("xxxxx",Principal.masquerLettres("abcde",'x'));
	}
	
	@Test public void masquerLettres_empty() {
		assertEquals("",Principal.masquerLettres("",'x'));
	}
	
	
	
	
}
