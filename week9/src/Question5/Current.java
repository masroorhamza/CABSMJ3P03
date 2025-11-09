package Question5;

class Current extends Account
{
    int Max_withdrawal_limit;

    public Current(int Max_withdrawal_limit)
    {
        this.Max_withdrawal_limit = Max_withdrawal_limit;
    }
    
    void display()
    {
        super.display();
        System.out.println("Minimum required balance is "+Max_withdrawal_limit);
    }
    
    void deposit(int amount)
    {
        System.out.println(amount+" Deposited into Current Account.");
    }
    
    void withdraw(int amount)
    {
        System.out.println(amount+" Withdrawn from Current Account.");
    } 
}
