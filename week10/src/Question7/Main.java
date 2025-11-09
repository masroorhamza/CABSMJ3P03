package Question7;

public class Main
{
    public static void main(String[] args)
    {
        Employee e=new Employee("Fahad", "DFG-38947");
        Employee.Salary s=e.new Salary(13000.0, 3000.0, 2500.0);
        Employee.JoiningDate j=e.new JoiningDate("04", "12", "2003");
        
        e.displayEmployee(s, j);
    }
}