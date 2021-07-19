public class App {

    public static void main(String[] args) 
    {
        int i;
        int index;
        int[] tableau = new int[] { 125 , 50 , 78 , 7 , 1054 , 60 };
        int temp;
        for(i = o ; i < tableau.length-1 ; i++)
        {
            for(index = tableau.length-1 ; index > i ; index--)
            {
                if( tableau[index] < tableau[index-1])
                {
                 temp = tableau[index];
                 tableau[index] = tableau[index-1];
                 tableau[index-1] = temp;
                }
            }
        }
    }
} 
