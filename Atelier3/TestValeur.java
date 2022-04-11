import java.util.Scanner;
public class TestValeur{
    public static void main(String arg[]){
        int n;
        int m;
        int Somme;
        
        Scanner s= new Scanner(System.in);
        System.out.println("Entrer la valeurs des 2 entiers");
        m=s.nextInt();
        n=s.nextInt();
        Somme=n+m;

        if(m>n){
            System.out.println("La valeur  "+m+"  est superieur a " +n);
        }else{
            System.out.println("La valeur  "+n+"  est superieur a " +m); 
        }
        
        System.out.println("La somme des deux valeur saisi est =>" +Somme);
    }
}