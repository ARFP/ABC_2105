package introduction;

public class Animal 
{
    private String specie;

    public Animal()
    {
        this("animal");
    }
    
    public Animal(String _specie) 
    {
        this.specie = _specie;
    }

    public void feed() 
    {
        System.out.println(this.specie + " mange sa nourriture !");
    }
}
