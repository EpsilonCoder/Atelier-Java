package atelier4_tache2;

import java.util.Scanner;

public class Personne {

	public static void main(String[] args) {
		
		String matricule,nom,prenom,adresse,dateNaissance,lieuNaissance;
		int telephone,nombre,i = 0;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Entrer le nombre de personne a enregistrer");
		nombre=s.nextInt();
		
		 for(i=0;i<nombre;i++) {
			
			System.out.println("Entrer le matricule , le nom et le prenom de la personne");			
			matricule=s.nextLine();
			nom=s.nextLine();
			prenom=s.nextLine();
			
			System.out.println("Entrer l'addresse , la date de naissance et lieu de naissance");
			
			adresse=s.nextLine();
			dateNaissance=s.nextLine();
			lieuNaissance=s.nextLine();
			
			System.out.println("Entre le numero de telephone de la personne");
			telephone=s.nextInt();
					    	
		    SaisiPersonne saisi=new SaisiPersonne(matricule,nom,prenom,adresse,dateNaissance,lieuNaissance,telephone);    	
		    saisi.afficher();	
		}
		
	
		
		

	}

}
