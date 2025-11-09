package LabHamza;
import java.util.Scanner;

public class PALINDROME{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an Integer for palindrome check: ");
        int n=input.nextInt();
        int rev=0, d, x=n;
        while(x!=0){
            d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev==n){
            System.out.print(n+" is palindrome.");
        }
        else{
            System.out.print(n+" is not palindrome.");
        }
    }
}