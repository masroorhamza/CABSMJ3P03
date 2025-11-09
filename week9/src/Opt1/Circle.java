package Opt1;

class Circle extends Shape
{
    int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }
    
    void area()
    {
        double a=Math.PI*(radius*radius);
        System.out.println("Area of Rectangle is "+a);
    }
}