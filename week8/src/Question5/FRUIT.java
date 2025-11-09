package Question5;

public class FRUIT
{
    private String color;
    private String taste;
    private int price;
    
    FRUIT()
    {
        this("-----", "-----", 0);
    }
    FRUIT(String c)
    {
        this(c, "unknown", 0);
    }
    FRUIT(String t, int p)
    {
        this("unknown", t, p);
    }
    FRUIT(String c, String t, int p)
    {
        color=c;
        taste=t;
        price=p;
    }
    
    void display()
    {
        System.out.println("\nColor of the fruit is: "+color);
        System.out.println("Taste of the fruit is: "+taste);
        System.out.println("Price of the fruit is Rs."+price);
    }
}