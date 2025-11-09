package Question2;

public class Department extends Faculty
{
    String dname;
    String chairman;
    
    void details()
    {
        System.out.println("Department: "+dname);
        System.out.println("Chairman of the Dept: "+chairman);
    }
    
    void display()
    {
        super.details();
        details();
    }
}