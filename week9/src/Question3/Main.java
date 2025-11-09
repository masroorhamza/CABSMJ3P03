package Question3;

public class Main
{
    public static void main(String[] args)
    {
        Account a=new Account();
        a.display();
        a.deposit(8000);
        a.withdraw(5000);
        
        double si=Account.calculateSimpleInterest(40000, 10, 3);
        System.out.println("Simple interest on principle of 40,000 at interest rate of 10% over 3 years is: "+si);
        
        double ci=Account.calculateCompoundInterest(40000, 10, 3);
        System.out.println("Compound interest on principle of 40,000 at interest rate of 10% over 3 years is: "+ci);
    }
}