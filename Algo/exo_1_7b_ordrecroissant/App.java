package exo_1_7b_ordrecroissant;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 

    {
        int a;
        int b;
        int c;
        Scanner scanner;
        scanner = new Scanner(System.in);

        
        
        System.out.println("Programme de tri de nombres entier.");

        System.out.println("Entrez votre premier chiffre");

        a = scanner.nextInt();

        System.out.println("Entrez votre deuxiéme chiffre");

        b = scanner.nextInt();

        System.out.print("Entrez votre troisième chiffre");
        c = scanner.nextInt();

        if(a > b)
        {
            if(b > c){
                if(c > a){
                    System.out.println("c b a");
                }
                else if(c <= a){
                    System.out.println("b + c + a");
                }
            }
            else if(b <= c){
                if(a > c){
                    System.out.println("b + c + a");
                }
                    else if(a <= c){
                        System.out.println("b + a + c");
                }
            } 
        }
        else if (a <= b )
        {
            System.out.println( a + " " + b);    
        }
       



        scanner.close();




        




        


    }    
}
