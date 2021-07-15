package personnes;

public class App 
{
    public static void main(String[] args) 
    {
        Personne p1;
        Employe e1;

        p1 = new Personne("DEV", "Mike", 42);
        e1 = new Employe("POPO", "Cindy", 21);

        String info = p1.getInfo();
        System.out.println("Personne: " + info);
        System.out.println("Personne: " + p1.getInfo());

        Personne[] personnes = new Personne[3];
        personnes[0] = p1;
        personnes[1] = e1;

        for(int i = 0; i < personnes.length; i++) 
        {
            if(personnes[i] instanceof Employe) {
                System.out.println(i + " = " + personnes[i].getInfo());
            }
            else {
                System.out.println(i + " est vide !");
            }
        }


        System.out.println("Pause");
    }
}
