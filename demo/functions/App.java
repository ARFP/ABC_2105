package functions;

import java.util.Scanner;

/**
 * INTRODUCTION AUX FONCTIONS
 */
public class App 
{
    public static void main(String[] args) 
    {
        int age;

        Scanner scanner = new Scanner(System.in);

        age = scanner.nextInt();
        
        majorite(age); // appel de la fonction "majorite"

        String resultat = retraite(age); // appel de la fonction "retraite" qui retourne une valeur
        
        System.out.println(resultat);

       resultat = superHero(age, "vous etes un super héro"); // appel de la fonction "superHero"
        
       System.out.println(resultat);

       System.out.println(superHero(42, "Ho Yeah")); // appel de la fonction "superHero"

        scanner.close();
    }
    
    /**
     * Affiche une phrase différente dans la console selon l'âge fourni en paramètre
     * @param toto un entier correspondant à un âge à analyser
     */
    static void majorite(int toto)
    {
        if(toto > 17)
        {
            System.out.println("Vous êtes majeur");
        }
        else if(toto < 0)
        {
            System.out.println("Vous n'êtes pas né");
        }
        else
        {
            System.out.println("Vous êtes mineur");
        }
    }
    
    /**
     * Retourne une phrase différente selon l'âge fourni en paramètre
     * @param age l'âge à analyser
     * @return une phrase indiquant si l'âge correspond à une personne retraitée (>=60) ou non.
     */
    static String retraite(int age)
    {
        if(age > 59)
        {
            // return retourne la valeur
            // return met fin à la fonction en cours
            return "Vous êtes retraité";
        }
        else
        {
            return "pas retraité";
        } 
    }

    /**
     * Définit sur l'âge correspond à l'âge d'un super héro fictif
     * @param age l'âge à tester
     * @param message le message à afficher si le test réussit
     * @return le message fourni en 2nd paramètre si le test réussit. Sinon, une phrase générique
     */
    static String superHero(int age, String message)
    {
        if(age == 42)
        {
            return message;
        }

        return "vous êtes une personne normale";
    }
}  

