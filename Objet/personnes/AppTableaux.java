package personnes;

public class AppTableaux
{
    public static void main2(String[] args) 
    {
        String[] tableau;

        tableau = new String[3];

        String[] tableau2;

        tableau2 = new String[] { "A", "B", "C" };

        tableau2 = new String[] { "AA", "BB", "CC", "DD", "EE", "RR" };


       /* String element2 = tableau2[1];

        tableau2[2] = element2;

        tableau2[0] = tableau2[1];*/


        for(int i = 0; i < tableau2.length; i++) 
        {
            System.out.println(i + " = " + tableau2[i]);
        }

        for(int i = tableau2.length - 1; i >= 0; i--) 
        {
            System.out.println(i + " = " + tableau2[i]);
        }

        

        //System.out.println("Pause");
    }
}
