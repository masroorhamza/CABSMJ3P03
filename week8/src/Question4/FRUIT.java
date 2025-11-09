package Question4;

public class FRUIT 
{
    private String color;
    private String taste;
    private int price;
    
    FRUIT()
    {
        color="----";
        taste="----";
        price=0;
    }
    FRUIT(String c)
    {
        color=c;
        taste="----";
        price=0;
    }
    FRUIT(String t, int p)
    {
        color="----";
        taste=t;
        price=p;
    }
    
    void display()
    {
        System.out.println("Color of the fruit is "+color);
        System.out.println("Taste of the fruit is "+taste);
        System.out.println("Price of the fruit is Rs."+price);
    }
}