package bases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotesTest {

	double[] tab;
	
	
	@Test
	public void genererTableauDeNotes_empty() {
		assertEquals(0,(Notes.genererTableauDeNotes(0)).length);
	}
	
	@Test
	public void genererTableauDeNotes_twenty() {
		assertEquals(20,(Notes.genererTableauDeNotes(20)).length);
	}
	
	
	
	@BeforeEach
	public void setUp()
	{
		tab = new double[20];
		tab[0] = 5.86542;
		tab[1] = 26.5547;
		tab[2] = 75.5698;
		tab[3] = 81.347;
		tab[4] = 9.365;
		tab[5] = 50.2178;
		tab[6] = 900000.415;
		tab[7] = 18.9853;
		tab[8] = 20.3644;
		tab[9] = 37.444;
		tab[10] = 46.6985;
		tab[11] = 67.6478;
		tab[12] = 49.3159;
		tab[13] = 1.000;
		tab[14] = 83.66874;
		tab[15] = 71.394536;
		tab[16] = 33.366543;
		tab[17] = 69.4346;
		tab[18] = 24.546;
		tab[19] = 73.7198;
	}
	
	@Test
	public void nombresDeNotesSuperieuresA_supTen() {
		assertEquals(18,Notes.nombresDeNotesSuperieuresA(tab,9));
	}
	
	@Test
	public void nombresDeNotesSuperieuresA_supFivety() {
		assertEquals(1,Notes.nombresDeNotesSuperieuresA(tab,2000));
	}
	
	
	
	@Test
	public void minimum_tab() {
		assertEquals(1.000,Notes.minimum(tab));
	}
	
	@Test
	public void maximum_tab() {
		assertEquals(900000.415,Notes.maximum(tab));
	}
	
	
	
	@Test 
	public void variete_one() {
		assertEquals(4,Notes.variete("abcd"));
	}

	@Test 
	public void variete_two() {
		assertEquals(3,Notes.variete("aabc"));
	}
	
	@Test 
	public void variete_three() {
		assertEquals(1,Notes.variete("aaA"));
	}
	
	@Test 
	public void variete_four() {
		assertEquals(1,Notes.variete("a2"));
	}
	
	
	
}
