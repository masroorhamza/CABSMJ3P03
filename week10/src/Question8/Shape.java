package Question8;

public class Shape
{
    public static int area(int side)
    {
        return side*side;
    }
    
    public static int area(int length, int breadth)
    {
        return length*breadth;
    }
    
    public static double area(double radius)
    {
        return Math.PI*2*radius;
    }
}