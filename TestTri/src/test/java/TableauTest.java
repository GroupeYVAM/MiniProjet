package test.java;

import org.junit.Test;

import main.java.Tableau;
import static org.junit.Assert.*;

public class TableauTest {
	@Test
	public void TestConstructeurTableau(){
			Tableau tab = new Tableau(8);
			assertEquals(8, tab.getTaille());
	}

	//@SuppressWarnings("deprecation")
	@Test
	public void TestSetTable()
	{
		Tableau t=new Tableau(8);
		t.setTable(5, 2);
		//assertEquals(t.getValeurTable(2),5);
		assertTrue(t.getValeurTable(2) == 5);
	}
	@Test
	public void TestTableauTrie()
	{
		Tableau t = new Tableau(4);
		float[] tab=t.GenerateurTableManuel();
		t.triTableau(tab);
		assertTrue(t.getEstTrie()==true);
		
	}
	

}

