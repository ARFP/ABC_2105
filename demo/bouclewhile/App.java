package bouclewhile;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        int saisie; 
        int quantiteActuelle = 0;
        Scanner scanner = new Scanner(System.in);
        
        /**
         * Demander à l'utilisateur de saisir une valeur
         * Sila valeur est hors limite, l'utilisateur est invité à resaisir une valeur.
         * FAIRE 
         *  LIRE saisie
         * TANT QUE saisie < 0.01 ET saisie > 1000000 
         */
        do 
        {
            System.out.println("Saisissez une valeur comprise entre 1 et 1000 : ");
            saisie = scanner.nextInt();
        }
        while(saisie < 1 || saisie >= 1000); // saisie doit etre comprise entre 1 et 1000;


        /**
         * TANT QUE quantiteActuelle EST INFERIEUR à saisie
         *      quantiteActuelle <-- quantiteActuelle + 1
         *      ECRIRE quantiteActuelle
         * FIN TANT QUE
         */
        while(quantiteActuelle < saisie) 
        {
            quantiteActuelle++;
            System.out.println(quantiteActuelle);
        }

        System.out.println("La bouteille est remplie avec while : " + quantiteActuelle);


        /**
         * POUR quantiteActuelle DE 0 à saisie
         *  ECRIRE quantiteActuelle
         * FIN POUR
         */
        for(quantiteActuelle = 0; quantiteActuelle < saisie; quantiteActuelle++) 
        {
            System.out.println(quantiteActuelle);
        }

        System.out.println("La bouteille est remplie avec for : " + quantiteActuelle);

        scanner.close();

    }
}