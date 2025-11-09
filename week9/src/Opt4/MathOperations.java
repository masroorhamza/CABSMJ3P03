package Opt4;

public class MathOperations
{
    public static int gcd(int a,int b)
    {
         if(b==0){
            return a;
         }
         else{
            return gcd(b,a%b);
         }
    }
    
    public static int lcm(int a,int b)
    {
        int lcm=(a*b)/gcd(a,b);
        return lcm;
    }
}

