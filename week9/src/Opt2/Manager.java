package Opt2;

public class Manager extends Employee
{
    String dept;

    public Manager(String name, int salary, String dept)
    {
        super(name, salary);
        this.dept = dept;
    }
    
    void Showdetails()
    {
        super.Showdetails();
        System.out.println("Department: "+dept);
    }
}