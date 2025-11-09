package Opt2;

class Employee
{
    String name;
    int salary;

    public Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }
    
    void Showdetails()
    {
        System.out.println("Employee Details: ");
        System.out.println("Name: "+name);
        System.out.println("Salary: Rs."+salary);
    }
}