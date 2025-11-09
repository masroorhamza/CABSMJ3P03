package Opt4;
       
public class Main 
{
    public static void main(String[] args)
    {
        int a=12;
        int b=15;
        int g=MathOperations.gcd(a,b);
        int l=MathOperations.lcm(a,b);
        System.out.println(" GCD: "+g);
        System.out.println(" LCM: " +l);
    }
}