package Question2;

public class Main
{
    public static void main(String[] args)
    {
        Saving s=new Saving();
        s.withdraw();
        s.deposit();
        s.takeLoan();
        
        Current c=new Current();
        c.withdraw();
        c.deposit();
        c.takeLoan();
    }
}