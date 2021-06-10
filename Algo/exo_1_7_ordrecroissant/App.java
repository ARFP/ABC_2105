package exo_1_7_ordrecroissant;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) 

    {
        int a;
        int b;
        Scanner scanner;
        scanner = new Scanner(System.in);

        
        
        System.out.println("Programme de tri de nombres entier.");

        System.out.println("Entrez votre premier chiffre");

        a = scanner.nextInt();

        System.out.println("Entrez votre deuxiéme chiffre");

        b = scanner.nextInt();

        if(a > b)
        {
            System.out.println( b + " " + a);    
        }
        else if (a < b )
        {
            System.out.println( a + " " + b);    
        }
        else 
        {
            System.out.println( a + " " + b);    
        }



        scanner.close();




        




        


    }    
}
