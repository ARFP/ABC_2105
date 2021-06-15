package inputs;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String saisie;
  
        int age = 0;

        do 
        {         
            System.out.println("Saisissez votre âge : ");

            // exécution d'un code qui peut potentiellement lever une Exception (plantage)
            try 
            {
                saisie = sc.nextLine();
                age = Integer.parseInt(saisie); // cette ligne peut potentiellement lever une Exception
                
            }
            // Si une exception est levée, nous "l'attrappons" dans le bloc catch suivant le bloc try.
            catch(Exception e) 
            {
                System.out.println("Erreur de saisie : " + e.getLocalizedMessage());
                sc.reset(); // Nettoyage des données du scanner
            }

        } while(age <= 0);

        sc.close();

        System.out.println("Vous avez: " + age + " an(s)");
    }
}
