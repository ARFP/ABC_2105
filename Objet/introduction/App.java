package introduction;

public class App {
    
    public static void main(String[] args) 
    {
        Animal animal = new Animal("Caribou");
        display(animal);

        Dog dog = new Dog();
        display(dog);

        Labrador labrador = new Labrador();
        display(labrador);

        System.out.println("-----------------------------");

        Dog otherDog = labrador;

        otherDog.move();

    }

    public static void display(Animal toutou) 
    {
        System.out.println(toutou.getSpecie());
        toutou.feed();
        toutou.move();
    }
}
