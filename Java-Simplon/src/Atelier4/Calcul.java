package Atelier4;

import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		
	 	Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("Entrer la valeur de a et b");
		a=s.nextInt();
		b=s.nextInt();
		
		Somme som=new Somme(a,b);
		som.Somm();
		
		Produit p=new Produit(a,b);
		p.prod();
		
		Difference d=new Difference(a,b);
		d.Diff();
		
		quotient q=new quotient(a,b);
		q.quot();
		
	}
}
