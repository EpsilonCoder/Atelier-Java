import java.util.Scanner;
public class ControleBoucleDoWile{
    public static void main(String arg[]){
        int a;
        int i=1;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Saisissez un entier");
        a=s.nextInt();
        
        do {
            System.out.println(i);
            i++;
        }while(i<a+1);

    }
}