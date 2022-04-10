import java.util.Scanner;
public class Programme5{
    public static void main(String arg[]){
        int a;
        int b;
        double quotient;
        
        Scanner s= new Scanner(System.in);
        System.out.println("Entrer la valeurs des 2 entiers");
        a=s.nextInt();
        b=s.nextInt();

        if(b==0){
            System.out.println("Le diviseur de la division ne doit pas etre nul");
        }else{
           quotient=a/b;
           System.out.println("La quotient des deux valeur saisi est =>"+quotient);
        }
    }
    
}