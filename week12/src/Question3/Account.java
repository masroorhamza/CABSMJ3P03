package Question3;

class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}

public class Account
{
    double balance;

    public Account(double balance)
    {
        this.balance = balance;
    }
    
    void withdraw(double amount) throws InsufficientFundsException
    {
        if(amount<=balance)
        {
            System.out.println(amount+" has been debited from your Account!");
        }
        else
        {
            throw new InsufficientFundsException("Insufficient Balance!");
        }
    }
}