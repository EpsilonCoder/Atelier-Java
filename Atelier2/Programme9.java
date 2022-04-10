import java.util.Scanner;
public class Programme9{
    public static void main(String arg[]){
        int entier;
        double reel;
        String chaine;

        
        Scanner s= new Scanner(System.in);
        System.out.println("Saisissez une chaine de caractere, un entier & un reel ");
        chaine=s.nextLine();
        entier=s.nextInt();
        reel=s.nextDouble();
        
    

    System.out.println("L entier est =>"+entier+"Le reel est=>"+reel+"la chaine de caractere est =>"+chaine);
        
    }
    
}