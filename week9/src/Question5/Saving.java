package Question5;

class Saving extends Account
{
    int Min_balance;

    Saving(int Min_balance)
    {
        super();
        this.Min_balance = Min_balance;
    }
    
    void display()
    {
        super.display();
        System.out.println("Minimum required balance is "+Min_balance);
    }
    
    void deposit(int amount)
    {
        System.out.println(amount+" Deposited in Savings Account.");
    }
    
    void withdraw(int amount)
    {
        System.out.println(amount+" Withdrawn from Savings Account.");
    } 
}
