package introduction;

public class App {
    
    public static void main(String[] args) 
    {
        Animal bee = new Animal();
        Animal horse = new Animal();

        bee.setSpecie("Abeille");
        horse.setSpecie("Cheval");

        System.out.println(bee.getSpecie());
        System.out.println(horse.getSpecie());
    }
}
