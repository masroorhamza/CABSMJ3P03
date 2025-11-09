package Question1;

public class Main
{
    public static void main(String[] args)
    {
        Bus bus=new Bus();
        bus.cost=1500000;
        bus.cost();
        bus.display();
        
        Train train=new Train();
        train.cost();
        train.cost=85900000;
        train.display();
    }
}