import java.util.Scanner;
public class Programme4{
    public static void main(String arg[]){
        int a;
        int b;
        int quotient;
        
        Scanner s= new Scanner(System.in);
        System.out.println("Entrer la valeurs des 2 entiers");
        a=s.nextInt();
        b=s.nextInt();
        quotient=a/b;
        
        System.out.println("La quotient des deux valeur saisi est =>"+quotient);

    }
    
}