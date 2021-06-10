package strings1;

import java.util.Scanner;

public class App 
{
    
    public static void main(String[] args) 
    {
        Scanner sc;
        String saisie;
        String[] chaine;

        sc = new Scanner(System.in);


        saisie = sc.nextLine(); // peut recevoir "toto" ou un nombre

        if(saisie == "toto") {
            // on quitte le programme
            
        }

        chaine = saisie.split(" ");


        int valeur = Integer.parseInt(chaine[0]);
        // 14 km
        // 14 mi
        // 14

        System.out.println(valeur  + " fin");

        sc.close();
    }
}
