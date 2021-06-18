package mabicyclette;

import java.util.Scanner;

/**
 * Ma Bicyclette par Michaël D
 */
public class App {
    
    public static void main(String[] args) 
    {
        boolean beauTemps;
        boolean reparationRapide;
        boolean etatBicyclette;
        boolean possGoT;
        boolean dispoGoT;

        Scanner scanner;
    
        scanner = new Scanner(System.in);
    
        System.out.println("Fait-il beau ?");
        beauTemps = scanner.nextBoolean();

        if(beauTemps)
        {
            System.out.println("Vous avez indiqué qu'il fait beau.");
            System.out.println("La bicyclette est-elle en bon état ?");
            etatBicyclette = scanner.nextBoolean();

            if(etatBicyclette)
            {
                System.out.println("La bicyclette est en bon état, je pars en balade !");
            }
            else
            {
                System.out.println("Je vais au garage.");
                System.out.println("Est-ce-que la réparation est rapide ?");
                reparationRapide = scanner.nextBoolean();

                if (reparationRapide)
                {
                    System.out.println("Réparations rapides ! Je vais me balader.");
                } 
                else 
                {
                    System.out.println("Je dois laisser ma bicyclette, je vais cueillir des joncs.");
                }
            }
        
        }
        else
        {
            System.out.println("Vous avez indiqué qu'il pleut.");
            System.out.println("Je vais lire un livre, est-ce-que GoT tome 1 est dans ma bibliothèque ?");
            possGoT = scanner.nextBoolean();

            if (possGoT) 
            {
                System.out.println("Le livre est dans la bibliothèque, je m'installe pour le lire");
            } 
            else 
            {
                System.out.println("Je ne trouve pas le livre, je vais à la bibliothèque municipale.");
                System.out.println("Est-il disponible à la bibliothèque municipale ?");
                dispoGoT = scanner.nextBoolean();

                if (dispoGoT) 
                {
                    System.out.println("Le livre est disponible ! Je l'emprunte.");
                } 
                else 
                {
                    System.out.println("Le livre n'est pas disponible, j'emprunte un roman policier à la place.");
                }
                
                System.out.println("Je rentre à la maison.");
            }
        }
        
        scanner.close();
    }

}