package introduction;

public class Animal 
{
    private String specie;

    public Animal(String _specie) 
    {
        System.out.println("constructeur de Animal");

        this.specie = _specie;
    }

    public String getSpecie() 
    {
        return this.specie;
    }

    public void feed() 
    {
        System.out.println(this.specie + "mange ! ");
    }

    public void move() 
    {
        System.out.println(this.specie + " se déplace.");
    }

}
