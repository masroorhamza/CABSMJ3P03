package Question3;

public class Compute
{
    static void minMaxadd(int a, int b)
    {
        System.out.println("Minimum: "+(a>b?b:a));
        System.out.println("Maximum: "+(a>b?a:b));
        System.out.println("Sum: "+(a+b));
    }
    
    static void minMaxadd(double a, double b)
    {
        System.out.println("Minimum: "+(a>b?b:a));
        System.out.println("Maximum: "+(a>b?a:b));
        System.out.println("Sum: "+(a+b));
    }
    
    static void minMaxadd(char a, char b)
    {
        System.out.println("Minimum: "+(a>b?b:a));
        System.out.println("Maximum: "+(a>b?a:b));
        System.out.println("Sum: "+(a+b));
    }
}