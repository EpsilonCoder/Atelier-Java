package Atelier7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Fichier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File supermarche=new File("C://Users/simplon/Desktop/java/supermarche.txt");
		String[] produit;
		int N,i;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter le nombre de produit a Enregister");
		N=s.nextInt();
		
		
		produit=new String[N];
		for (i=0;i<N;i++) {		
			System.out.println("Enregister le produit N? " +i+ " a acheter ");
			produit[i]=s.nextLine();
		}
		
		
		if(!supermarche.exists()) {
			try {
				supermarche.createNewFile();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	
		try {
			FileWriter ecrire=new FileWriter(supermarche);
			BufferedWriter bw=new BufferedWriter(ecrire);
			for(i=0;i<N;i++) {
			produit[i].toString();
	        System.out.println(produit[i]);
		    bw.write(produit[i] +"||");
			}
			bw.close();
			ecrire.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		}

	}

