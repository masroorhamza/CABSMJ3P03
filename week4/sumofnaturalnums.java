package week4;
import java.util.Scanner;

public class sumofnaturalnums{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter n for the natural numbers series: ");
        int n=input.nextInt();
        int sum=n*(n+1)/2;
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
    }
}
