import java.util.Scanner;
public class Programme6{
    public static void main(String arg[]){
        int a;
        int b;
        int c;
        int d;
        int e;
        
        double moyenne;
        
        Scanner s= new Scanner(System.in);
        System.out.println("Entrer la valeurs des 5 entiers");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        e=s.nextInt();

           moyenne=(a+b+c+d+e)/5;
           System.out.println("La moyenne des deux valeur saisi est =>"+moyenne);
        
    }
    
}