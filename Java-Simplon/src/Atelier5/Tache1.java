package Atelier5;

import java.util.Scanner;

public class Tache1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int tab[];
		int N,i;
		
		System.out.println("Entrer la taille de votre tableau");
		N=s.nextInt();
		tab=new int[N];
		for (i=0;i<N;i++) {
			System.out.println("Entrer la valeur du tableau a la position N "+i);
			tab[i]=s.nextInt();
		}
		
		for(i=0;i<N;i++) {
	        System.out.println(tab[i]+ ",");
		}
		
		
		
		
	
		
		
		
	}

}
