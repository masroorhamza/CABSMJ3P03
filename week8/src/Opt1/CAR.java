package Opt1;

public class CAR
{
    private String model;
    private String color;
    private int price;
    
    CAR()
    {
        this("unknown", "unknown");
        price=0;
    }
    CAR(String m)
    {
        this(m, "unknown");
        price=0;
    }
    CAR(String m, String c)
    {
        model=m;
        color=c;
    }
    
    void setDetails(String m, String c, int p)
    {
        model=m;
        color=c;
        price=p;
    }
    
    //getters:
    
    String getmodel()
    {
        return model;
    }
    String getcolor()
    {
        return color;
    }
    int getprice()
    {
        return price;
    }
    
    void getDetails()
    {
        System.out.println("\nCar Model: "+getmodel());
        System.out.println("Car Color: "+getcolor());
        System.out.println("Car Price: "+getprice()+" USD");
    }
    
    void display()
    {
        System.out.print("\nCar Details: ");
        getDetails();
    }
}