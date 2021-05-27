package moyenne;

import java.util.Scanner; // importer le composant Scanner

public class App 
{
    public static void main(String[] args) {

        int a;
        int b;
        Scanner scanner;
        float resultat;
        
        System.out.println("Calcul de la moyenne de 2 nombres entier.");

        // votre algorithme 

        scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un 1er nombre entier : ");
        a = scanner.nextInt();
        
        System.out.println("Veuillez saisir un 2nd nombre entier : ");
        b = scanner.nextInt();

        resultat = (float)a; // conversion de a vers un float

        resultat = ((float)a + (float)b) / 2f;

        System.out.println("Le résultat est: " + resultat);


        scanner.close(); // obligatoire (libère les ressources)

    }

}
