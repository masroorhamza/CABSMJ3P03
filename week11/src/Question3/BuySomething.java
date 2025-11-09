package Question3;

public class BuySomething implements Bike, Scooty
{
    public void offer()
    {
        System.out.println("Offers on Bike and Scooty!!");
    }
    
    public void details()
    {
        System.out.println("Details method from BuySomething Class:");
        Bike.super.details();
        Scooty.super.details();
    }
}