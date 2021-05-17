using System;

namespace demo_01
{
    class Program
    {
        #region demo1

        static void Main(string[] args)
        {
            /** P1 = il fait plus de 25 degrés */
            bool P1 = true;

            /** P2 = il ne pleut pas */
            bool P2 = true;

            /** P3 = je vais me balader 
              * P3 est vrai si P1 et P2 sont vrais */
            bool P3 = P1 && P2;

            
            if(P3) 
            {
                Console.WriteLine("Je vais me balader."); // P3 est vrai
            }
            else 
            {
                Console.WriteLine("Je reste chez moi."); // P3 est faux
            }


            Console.ReadLine();
        }

        #endregion

        #region demo2

        static void Main2(string[] args)
        {
            string reponse;

            Console.WriteLine("Il fait plus de 25 degrés. (O/N) : ");

            reponse = Console.ReadLine();

            /** P1 = il fait plus de 25 degrés */
            bool P1 = reponse == "o";


            Console.WriteLine("il ne pleut pas. (O/N) : ");

            reponse = Console.ReadLine();

            /** P2 = il ne pleut pas */
            bool P2 = reponse == "o";


            /** P3 = je vais me balader 
              * P3 est vrai si P1 et P2 sont vrais */
            bool P3 = P1 && P2;

            
            if(P3) 
            {
                Console.WriteLine("Je vais me balader."); // P3 est vrai
            }
            else 
            {
                Console.WriteLine("Je reste chez moi."); // P3 est faux
            }


            Console.ReadLine();
        }

        #endregion
    }
}
