import java.util.Scanner;
public class Programme3{
    public static void main(String arg[]){
        int a;
        int b;
        int difference;
        
        Scanner s= new Scanner(System.in);
        System.out.println("Entrer la valeurs des 2 entiers");
        a=s.nextInt();
        b=s.nextInt();
        difference=a-b;
        
        System.out.println("La difference des deux valeur saisi est =>"+difference);

    }
    
}