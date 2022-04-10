import java.util.Scanner;
public class Programme2{
    public static void main(String arg[]){
        int a;
        int b;
        int produit;
        
        Scanner s= new Scanner(System.in);
        System.out.println("Entrer la valeurs des 2 entiers");
        a=s.nextInt();
        b=s.nextInt();
        produit=a*b;
        
        System.out.println("Le produit des deux valeur saisi est =>"+produit);

    }
    
}