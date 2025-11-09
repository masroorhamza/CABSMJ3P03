package week7;

public class factorial_rec{
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    
    public static void main(String[] args){
        int n=7;
        int fact=factorial(n);
        System.out.print("Factorial of "+n+" is: "+fact);
    }
}