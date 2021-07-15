package personnes;

public class Personne 
{
    private String lastname;

    private String firstname;

    private int age;


    public Personne(String _lastname, String _firstname, int _age)
    {
        this.lastname = _lastname;
        this.firstname = _firstname;
        this.age = _age;
    }

    public String getInfo() 
    {
       return this.lastname + " " + this.firstname + " " + this.age;
    }
}
