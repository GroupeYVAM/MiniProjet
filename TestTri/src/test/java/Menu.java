package test.java;

import main.java.Tableau;

public class Menu {

	public static void main(String[] args) {
			
			/*Tableau tab=new Tableau(8);
			float[] t=tab.GenerateurTableManuel();
			tab.triTableau(t);
			System.out.println(tab.toString());
			System.out.println("Saisir valeur a chercher(avec une virgule!)");*/
		Tableau t = new Tableau(4);
		float[] tab=t.GenerateurTableManuel();
		t.triTableau(tab);
		for(int i=0; i<4; i++)
		{
			System.out.println(tab[i]);
		}
			System.out.println(t.getEstTrie());
		}
}
