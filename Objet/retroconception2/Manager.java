package retroconception2;

import java.util.Date;

public class Manager extends Employee 
{
    

    public Manager(String _lastname, String _firstname, Date _birthday)
    {
        super(_lastname, _firstname, _birthday);
    }

    public String getInfo() 
    {
        return "Manager " + super.getInfo();
    }

    public String whipEmployee(Employee _employee)
    {
        return this.getInfo() + " whips " + _employee.getInfo(); 
    }
}
