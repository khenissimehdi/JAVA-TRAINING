package bases;

import java.util.Arrays;

public class Tableau {
	
	public static void main(String[] args )
	{
		/*Principal.recherche("bonjour le chat et le chien", "ch");*/
		int[] monTableau ;
		
		monTableau = new int [12];
		monTableau[0]= 42;
		System.out.println("Longueur" + monTableau.length);
		System.out.println(" ");
		
		
		for(int i = 0 ; i < monTableau.length;i++) {
			monTableau[i] = (i*12)/5;
			monTableau[i] = (monTableau[i]%3 == 0) ? monTableau[i]+4 : monTableau[i]*2; 
			System.out.println("Indice " + i + " du tableau : " + monTableau[i]);
		}
		System.out.println(" ");
		
		
		Arrays.sort(monTableau);
		
		
		int ind = 0;
		for(int n : monTableau) {
			System.out.println("Indice " + ind + " du tableau : " + n);
			ind ++;
		}
		System.out.println(" ");
		
		
		int nb = 25;
		int idx = Arrays.binarySearch(monTableau, nb);
		System.out.println("Indice " + nb + " du tableau : " + idx);
		System.out.println(" ");
		
		
		int[] copie = Arrays.copyOf(monTableau, 5);
		System.out.println(Arrays.toString(copie));
		
		
		int ind1 = 0;
		for(int c : copie) {
			System.out.println("Indice " + ind1 + " du tableau : " + c);
			ind1 ++;
		}
		

		
		
		
		
	}
	

}
