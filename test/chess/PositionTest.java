package chess;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bases.Notes;

class PositionTest {
	
	@Test
	public void Position_char1() {
		try {
			Position positionA = new Position("A");
			fail("La chaine de caractères ne possèdent pas deux caractères");
		}
		catch (IllegalArgumentException e) {}
	}
	
	@Test
	public void Position_charI() {
		try {
			Position positionI = new Position("I1");
			fail("Le premier caractère (I) n'est pas comprit entre A et H");
		}
		catch (IllegalArgumentException e) {}
	}
	
	@Test
	public void Position_charMinH() {
		try {
			Position positionMinH = new Position("h1");
			fail("Le premier caractère (h) n'est pas comprit entre A et H");
		}
		catch (IllegalArgumentException e) {}
	}
	
	@Test
	public void Position_InfUn() {
		try {
			Position positionInfUn = new Position("H0");
			fail("Le deuxième caractère (0) est inférieur à 1");
		}
		catch (IllegalArgumentException e) {}
	}
	
	@Test
	public void Position_SupHuit() {
		try {
			Position positionSupHuit = new Position("H9");
			fail("Le deuxième caractère (9) est supérieur à 8");
		}
		catch (IllegalArgumentException e) {}
	}
	
	@Test
	public void Position_Valid() {
		Position positionValid = new Position("C4");
		assertNotNull(positionValid);
	}
	
	
	@Test
	public void toAlgebraicNotation_C4() {
		Position pos = new Position("C4");
		assertEquals("C4",pos.toAlgebraicNotation());
	}
	
	
	@Test
	public void isOnSameLineAs_true() {
		Position posC1 = new Position("C1");
		Position posB1 = new Position("B1");
		assertEquals(true,posC1.isOnSameLineAs(posB1));
	}
		
	@Test
	public void isOnSameLineAs_false() {
		Position posC1 = new Position("C1");
		Position posB5 = new Position("B5");
		assertEquals(false,posB5.isOnSameLineAs(posC1));
	}
	
	
	@Test
	public void isOnSameColumnAs_true() {
		Position posC1 = new Position("C1");
		Position posC5 = new Position("C5");
		assertEquals(true,posC1.isOnSameColumnAs(posC5));
	}
	
	@Test
	public void isOnSameColumnAs_false() {
		Position posC1 = new Position("C1");
		Position posB5 = new Position("B5");
		assertEquals(false,posB5.isOnSameColumnAs(posC1));
	}
	
	
	@Test
	public void isOnSameDiagonalAs_true_diag1() {
		Position posC3 = new Position("C3");
		Position posG7 = new Position("G7");
		assertEquals(true,posC3.isOnSameDiagonalAs(posG7));
	}
	
	@Test
	public void isOnSameDiagonalAs_true_diag2() {
		Position posA8 = new Position("A8");
		Position posG3 = new Position("G2");
		assertEquals(true,posG3.isOnSameDiagonalAs(posA8));
	}
	
	@Test
	public void isOnSameDiagonalAs_false() {
		Position posF2 = new Position("F2");
		Position posG3 = new Position("G5");
		assertEquals(false,posF2.isOnSameDiagonalAs(posG3));
	}
	
	
	@Test
	public void getManhattanDistance_valid() {
		Position posF2 = new Position("F2");
		Position posG3 = new Position("G5");
		int distanceManhattan = Math.abs(posF2.getX() - posG3.getX()) + Math.abs(posF2.getY() - posG3.getY());
		assertEquals(distanceManhattan,posF2.getManhattanDistance(posG3));
		assertEquals(distanceManhattan,posG3.getManhattanDistance(posF2));
	}
	
}
