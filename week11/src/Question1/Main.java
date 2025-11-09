package Question1;

public class Main
{
    public static void main(String[] args)
    {
        Account.aboutBank();
        
        Saving s=new Saving();
        s.withdraw();
        s.deposit();
        
        Current c=new Current();
        c.withdraw();
        c.deposit();
    }
}