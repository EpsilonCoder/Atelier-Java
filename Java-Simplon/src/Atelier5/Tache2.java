package Atelier5;

import java.util.Scanner;

public class Tache2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tab[],i,N,somme = 0;
		System.out.println("Enter la taille de votre tableau");
		N=s.nextInt();
		tab=new int[N];
		
		
		for (i=0;i<N;i++) {
			System.out.println("Saisir la valuer a la position N " +i);
			tab[i]=s.nextInt();
		}
		
		for (i=0;i<N;i++) {
			System.out.print(tab[i]+"|");
			somme=somme+tab[i];
		}
		System.out.println("La somme est " +somme);
		

	}

}
