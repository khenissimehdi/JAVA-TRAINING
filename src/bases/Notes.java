package bases;

public class Notes {
	
	
	public static void main(String[] args )
	{
		double[] tab = genererTableauDeNotes(10);
		
		
		int ind = 0;
		for(double n : tab) {
			System.out.println("Indice " + ind + " du tableau : " + n);
			ind ++;
		}
		System.out.println(" ");
		
	}
	
	
	public static double[] genererTableauDeNotes(int capacite)
	{
		double[] res;
		res = new double[capacite];
		for (int i = 0; i < res.length; i++)
		{
			res[i] = Math.random() * 20;
		}
		
		return res;
	}

	
	public static int nombresDeNotesSuperieuresA(double[] tab2, double value)
	{
		int res = 0;
		for (int i = 0; i < tab2.length; i++)
		{
			res = (tab2[i] > value) ? res+1 : res ;
		}
		
		return res;
	}
	
	
	

}
