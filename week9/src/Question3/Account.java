package Question3;

public class Account
{
    String Id;
    String Account_holder_name;
    String Address;
    
    Account()
    {
        Id="ABC9876";
        Account_holder_name="XYZ";
        Address="Aligarh, India";
    }
    
    void display()
    {
        System.out.println("\nAccount Details: ");
        System.out.println("Account Id: "+Id);
        System.out.println("Account Holder Name: "+Account_holder_name);
        System.out.println("Address: "+Address);
    }
    
    void deposit(int amount)
    {
        System.out.println(amount+" Deposited.");
    }
    
    void withdraw(int amount)
    {
        System.out.println(amount+" Withdrawn.");
    }
    
    static double calculateSimpleInterest(double principle, double rate, int year)
    {
        double si=year*(principle*(rate/100.0));
        return si;
    }
    
    static double calculateCompoundInterest(double principle, double rate, int year)
    {
        double ci=0;
        for(int i=0;i<year;i++)
        {
            ci+=principle*(rate/100.0);
            principle+=ci;
        }
        return ci;
    }
}