package Opt3;

public class Main
{
    public static void main(String[] args)
    {
        WashingMachine m=new WashingMachine();
        m.turnOn();
        m.turnOff();
        
        Refrigerator r=new Refrigerator();
        r.turnOn();
        r.turnOff();
    }
}