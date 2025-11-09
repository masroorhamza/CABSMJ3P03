package Question7;

public class Employee
{
    String empName;
    String empId;

    public Employee(String empName, String empId)
    {
        this.empName = empName;
        this.empId = empId;
    }
    
    public class Salary
    {
        double basic;
        double hra;
        double pf;

        public Salary(double basic, double hra, double pf)
        {
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }
        
        void displaySalary()
        {
            System.out.print("Salary: ");
            System.out.println("Basic: "+basic+"\tHRA: "+hra+"\tPF: "+pf);
        }
    }
    
    public class JoiningDate
    {
        String day;
        String month;
        String year;

        public JoiningDate(String day, String month, String year)
        {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        
        void displayJoiningDate()
        {
            System.out.println("Joining Date(DD/MM/YY) : "+day+"/"+month+"/"+year);
        }
    }
    
    void displayEmployee(Salary s, JoiningDate j)
    {
        System.out.println("\nEmployee Details: ");
        System.out.println("Name: "+empName+"\nID: "+empId);
        s.displaySalary();
        j.displayJoiningDate();
    }
}