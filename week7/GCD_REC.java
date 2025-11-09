package week7;
import java.util.Scanner;

public class GCD{
    public static int gcd(int a, int b){
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        int r=a%b;
        if(r==0){
            return b;
        }
        else{
            return gcd(b,r);
        }
    }
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer:");
        int x=input.nextInt();
        System.out.print("Enter another integer:");
        int y=input.nextInt();
        System.out.print("\nGCD of "+x+" and "+y+" is: "+gcd(x,y));
    }
}