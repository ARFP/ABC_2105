package introduction;

public class Animal 
{
    private String specie;


    public Animal() 
    {
        System.out.println("constructeur de Animal");

        this.specie = "Insecte";
    }

    public String getSpecie() 
    {
        return this.specie;
    }

    public void setSpecie(String toto) 
    {
        if(toto.length() > 2) {
            this.specie = toto;
        }  
    }

    public void feed() 
    {
        System.out.println(this.specie + "mange ! ");
    }

}
