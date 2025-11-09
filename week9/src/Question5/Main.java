package Question5;

public class Main
{
    public static void main(String[] args)
    {
        Saving s=new Saving(20000);
        s.display();
        s.deposit(2000);
        s.withdraw(5000);
        
        Current c=new Current(30000);
        c.display();
        c.deposit(7000);
        c.withdraw(4000);
    }
}