package main.java;

	import java.util.Arrays;

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
		
		public float[] GenTabManu() {
			
			float [] tab = {1,2,3,4,5};
			
			return tab;
		}
		
		public void setTable(float chg,int i){
			this.tab[i]=chg;
		}
		
		public float getValeurTableau(int i)
		{
			return this.tab[i];
		}

		public int RechercheTable(float val) {

			  boolean trouve; 
			  int id; 
			  int ifin;  
			  int im; 
			  
			  trouve = false;  
			  id = 0;  
			  ifin = taille;  
			  
			
			  while(!trouve && ((ifin - id) > 1)){

			    im = (id + ifin)/2;  
			    
			    trouve = (tab[im] == val);  
			    if(tab[im] > val) 
			    	ifin = im;  
			    else 
			    	id = im;  
			  }
			  

			  if(tab[id] == val)
				  return(id);  
			  else 
				  return(4);  
			  
			}

		public String toString() {
			return "Tableau "+Arrays.toString(tab);
		}
	}
