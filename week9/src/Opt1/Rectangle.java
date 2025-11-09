package Opt1;

class Rectangle extends Shape
{
    int length;
    int breadth;

    public Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    
    void area()
    {
        int a=length*breadth;
        System.out.println("Area of Rectangle is "+a);
    }
}