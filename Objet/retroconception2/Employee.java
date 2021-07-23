package retroconception2;

import java.util.Date;

public class Employee 
{
    private String lastname;

    private String firstname;

    private Date birthday;

    public Employee(String _lastname, String _firstname, Date _birthday)
    {
        this.lastname = _lastname;
        this.firstname = _firstname;
        this.birthday = _birthday;
    }

    public String getInfo() 
    {
        return this.lastname + " " + this.firstname + " " + this.birthday.toString();
    }
}
