package exo_01_1_moyenne;

/**
 * Calcule la moyenne de 2 nombres
 */
public class Moyenne 
{
    public static void main(String[] args) 
    {
        int a;
        int b;
        float resultat;

        System.out.println("Calcul de la moyenne de 2 nombres.");

        a = 333;
        b = 2299;

        resultat = ((float)a + (float)b) / 3;

        System.out.println("Le résultat du calcul est : " + resultat);
    }
}
