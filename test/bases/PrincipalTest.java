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
	
	
	
	@Test public void estUnPalindrome_empty() {
		assertEquals(true,Principal.estUnPalindrome(""));
	}
	
	@Test public void estUnPalindrome_normalLengthPair() {
		assertEquals(true,Principal.estUnPalindrome("abba"));
	}
	
	@Test public void estUnPalindrome_normalLengthImpaire() {
		assertEquals(true,Principal.estUnPalindrome("aboba"));
	}
	
	@Test public void estUnPalindrome_invalid() {
		assertEquals(false,Principal.estUnPalindrome("aba"));
	}
	
	
	
	
	
}
