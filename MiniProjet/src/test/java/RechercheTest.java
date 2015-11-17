package test.java;

import org.junit.Test;

import main.java.Tableau;
import static org.junit.Assert.*;

public class RechercheTest {

	@Test
	
	
	public void TestRecherche() {
		
		Tableau t = new Tableau(5);
		t.GenTabManu();
		int i = 4;
		// 1 | 2 | 3 | 4 | 5 |
		t.GenTabManu();
		System.out.println(t.RechercheTable(5));
		assertTrue(i == t.RechercheTable(5));
	}

}
