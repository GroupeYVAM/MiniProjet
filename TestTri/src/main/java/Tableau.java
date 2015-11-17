package main.java;

	import java.util.*;

	public class Tableau{
		
		private float [] tab;
		private int taille;
		private boolean estTrie;
		
		public Tableau(int t) {
			tab= new float[t];
			taille=t;
			estTrie=false;
		}
		
		public float[] getTableau() {
			return this.tab;
		}
		
		public int getTaille() {
			return this.taille;
		}
		
		public boolean getEstTrie() {
			return this.estTrie;
		}
		
		public float[] GenTableAlea() {
			for(int i=0;i<this.taille;i++) {
				this.tab[i]= (float)( Math.random()*(2200)-1100);
			}
			return this.tab;
		}
		
		public void setTable(float chg,int i){
			this.tab[i]=chg;
		}
		
		public float getValeurTable(int i)
		{
			
			return this.tab[i];
		}

		public float[] GenerateurTableManuel() {

			/*//Scanner sc =new Scanner(System.in);
			//float val=0;
			try{
				for(int i=0;i<this.taille;i++) {
					System.out.println("Entrez une valeur pour la case : "+i);
					val=sc.nextFloat();
					this.tab[i]=val;
				}
				sc.close();
			}
				catch(Exception e){
					System.out.println("Erreur format incompatible");
				}
			}*/
			
			float[] tab = {4,3,2,1};
			
			return tab;
			
		}
		public float[] triTableau(float tableau[]) {
			int longueur = tableau.length;
			float tampon = 0;
			
	 
			do {
				
				this.estTrie= false;
				for (int i = 0; i < longueur - 1; i++) {
					
					if (tableau[i] > tableau[i + 1]) {
			
						tampon = tableau[i];
						tableau[i] = tableau[i + 1];
						tableau[i + 1] = tampon;
						this.estTrie = true;
					}
				}
			} while (this.estTrie);
			this.estTrie=true;
			return tableau;
		}
		
		/* public float[] triTable() {
			 
	             for (int i=0 ;i<=this.taille;i++) {
	                     for (int j=i+1;j<this.taille;j++) {
	                             if (this.tab[i] > this.tab[j]) {
	                                     float x=this.tab[j];
	                                     this.tab[j]=this.tab[i];
	                                     this.tab[i]=x;
	                             }
	                     }
	             }
	             this.estTrie=true;
	             return this.tab;
	     	}
*/
		public String toString() {
			return "Tableau "+Arrays.toString(tab);
		}
	}
