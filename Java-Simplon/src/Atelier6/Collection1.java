package Atelier6;
import java.util.*;
public class Collection1 {

	public static void main(String[] args) {
		int L;
		String tab[];
		Scanner s = new Scanner(System.in);
		System.out.println("Entrer le nombre de livre a enregistrer");
		
		L=s.nextInt();
		tab=new String[L];
		
		for(int i=1;i<L;i++) {
			System.out.println("Entrer le livre N "+i+" =>");
			tab[i]=s.nextLine();
		}
		
		List<String> livre=new ArrayList<>(Arrays.asList(tab));		
		System.out.println("La liste des livre ajout? est de \n"+livre);
			
	}

}
