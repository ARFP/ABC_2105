package retroconception2;

import java.util.ArrayList;

public class Company 
{
    private String label;

    private ArrayList<Employee> staff;

    public Company(String _label)
    {
        this.label = _label;
        this.staff = new ArrayList<Employee>();
    }

    public void hire(Employee _employee) 
    {
        this.staff.add(_employee);
    }

    public void fire(Employee _employee) 
    {
        this.staff.remove(_employee);
    }
    
}
