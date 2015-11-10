
public class triTab {

	private int[] tab;


	public triTab(){
		
		for(int i=0; i<tab.length; i++){
			
			tab[i]=0;		}
	}
	public triTab(int[] t)
	{
		for (int i=0; i<tab.length;i++){
			
			tab[i]=t[i];
		}
	}
	public void afficheTab(int [] t)
	{
		System.out.println("Les valeurs du tableau sont: ");
		for(int i=0; i<t.length; i++)
		{
			System.out.println(t[i]);
		}
	}
}
