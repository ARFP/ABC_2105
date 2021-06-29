package introduction;

public class Dog extends Animal
{
    
    public Dog() 
    {
        super("Chien");
        System.out.println("Constructeur de Dog");
    }

    public void feed() 
    {
        super.feed();
        System.out.println(this.getSpecie() + " mange de la patée ! ");
    }
}
