package Personnel;

import java.util.Scanner;

public class TestPersonnel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom,matricule,societe;
		int ht,hc;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter le nom , le matricule et la societé ");
		nom=s.nextLine();
		matricule=s.nextLine();
		societe=s.nextLine();
		System.out.println("Enter hc et hc");
		ht=s.nextInt();
		hc=s.nextInt();
		
		Personnel p=new Personnel(nom,matricule,societe,ht,hc);
		p.indemnite();
		p.pension();
		p.imprimer();

	}

}
