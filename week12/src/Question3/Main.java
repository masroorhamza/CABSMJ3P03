package Question3;

public class Main
{
    public static void main(String[] args)
    {
        Account a=new Account(47604.80);
        double amount=50000;
        
        try
        {
            a.withdraw(amount);
        }
        catch(InsufficientFundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}