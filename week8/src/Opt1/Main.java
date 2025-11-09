package Opt1;

public class Main
{
    public static void main(String[] args)
    {
        //for car 1:
        CAR c1=new CAR();
        c1.display();
        
        //for car 2:
        CAR c2=new CAR("BMW M3");
        c2.setDetails("BMW M3", "Unknown", 80000);
        c2.display();
        
        //for car 3:
        CAR c3=new CAR("Toyota Supra", "Olive Green");
        c3.setDetails("Toyota Supra", "Olive Green", 100000);
        c3.display();
    }
}