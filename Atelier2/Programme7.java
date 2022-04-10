import java.util.Scanner;
public class Programme7{
    public static void main(String arg[]){
        int a;
        
        Scanner s= new Scanner(System.in);
        System.out.println("Saisissez un entier");
        a=s.nextInt();
        if(a>0){
          System.out.println("L entier saisi est positif");
        }else if(a<0){

           System.out.println("l entier saisi est negative");
        }else{
          System.out.println("l entier saisi est nul");
        }
        
    }
    
}