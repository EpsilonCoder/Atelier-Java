package Atelier6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		Scanner livre=new Scanner(System.in);
		int L,i;
		String[] tab,ajout;
		
		System.out.println("Entrer le nombre de livres a enregister");
		L=livre.nextInt();
		tab=new String[L];
		
		for(i=0;i<tab.length;i++) {
			System.out.println("Entrer le livre N "+i);
			tab[i]=livre.nextLine();	
		}
	
		List<String> Ouvrage=new ArrayList<>(Arrays.asList(tab));
		System.out.println("Voici la liste des ouvrages\n"+Ouvrage);
		
	    ajout=new String[3];
	    
	    for(i=0;i<3;i++) {
	    	System.out.println("Entrer le nom de l ajout N �"+i);
	    	ajout[i]=livre.nextLine();
	    }
		
				
		
		List<String> AjoutOuvrage=new ArrayList<>(Arrays.asList(ajout));
		
		Ouvrage.addAll(i, AjoutOuvrage);
		System.out.println("Voici la liste des ouvrages apres ajout \n"+Ouvrage+"\n la taille de votre liste est de " +Ouvrage.size());
		Ouvrage.remove(5);
		System.out.println("Voici la liste des ouvrages apres suppression de l' index 5 \n"+Ouvrage+"\n la taille de votre liste est de " +Ouvrage.size());
	
		System.out.println("Voici la recuperation de l'index 3\n"+Ouvrage.get(3));
		
		
		

	}

}
