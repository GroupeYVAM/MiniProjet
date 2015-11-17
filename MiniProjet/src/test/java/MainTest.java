package test.java;

import main.java.Tableau;


public class MainTest {
	
	public static void main(String[] args) {
		
		/*Tableau tab = new Tableau(5);
		tab.GenTabManu();
		System.out.println(tab.toString());
		/*System.out.println("Saisir valeur a chercher(avec une virgule!)");
		Scanner rv=new Scanner(System.in);
		float val=rv.nextFloat();
		if(tab.RechercheTable(2)==-1){
			System.out.println("La valeur n'est pas dans le tableau");
		}
		else{
			System.out.println("La valeur existe dans le tableau à l'indice "+tab.RechercheTable(2));
		}*/
		Tableau t = new Tableau(5);
		t.GenTabManu();
		int i = 4;
		// 1 | 2 | 3 | 4 | 5 |
		t.GenTabManu();
		System.out.println(t.RechercheTable(5));
	}
}
