package Question2;

public class FRUIT
{
    private String color;
    private String taste;
    private int price;
    
    void setdetails(String c, String t, int p)
    {
        color=c;
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