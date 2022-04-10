import java.util.Scanner;
public class Programme8{
    public static void main(String arg[]){
        int a;
        
        Scanner s= new Scanner(System.in);
        System.out.println("Saisissez un entier");
        a=s.nextInt();
        
        for (int i=1;i<a;i++){
            System.out.println(i);
        }
        
    }
    
}