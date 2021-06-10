package bouclefor;

public class App {
    
    public static void main(String[] args) 
    {
        // Déclaration d'un tableau de chaines de caractères
        String[] prenoms;

        // Initialisation d'un tableau de 4 cases 
        // (la longueur n'est plus modifiable après l'initialisation)
        // Par défautl, toutes les cases sont vides (null)
        prenoms = new String[4];

        // ajout de données dans les cases du tableau
        // 0 = 1ère case
        // 1 = 2ème case
        // etc...
        prenoms[0] = "Mike";
        prenoms[1] = "Marcel";
        prenoms[2] = "Cindy";
        prenoms[3] = "Pauline";

        /**
         * Parcourir un tableau avec la boucle for         * 
         * 
         * POUR i de 0 à prenoms.length - 1
         *      ECRIRE prenoms[i] 
         * FIN POUR
         */
        for(int i = 0; i < prenoms.length; i++) 
        {
            // affiche le prénom à la position i
            System.out.println(prenoms[i]);
        }

        System.out.println("Programme terminé");

    }
}
