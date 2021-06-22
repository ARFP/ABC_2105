package introduction;

public class App {
    
    public static void main(String[] args) 
    {
        Animal animal = new Animal();

        animal.feed();



        Animal bee = new Animal("abeille");

        bee.feed();



        Dog dog = new Dog();

        dog.feed();
    }
}
