package week3;
import java.util.Scanner;

public class avgofthree{
    public static void main(String[] args){
        //creating a scanner object to read input:
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter Integer-1: ");
        int a=scanner.nextInt();
        System.out.print("Enter Integer-2: ");
        int b=scanner.nextInt();
        System.out.print("Enter Integer-3: ");
        int c=scanner.nextInt();
        
        double avg=(a+b+c)/3.0;
        System.out.println("Average of "+a+", "+b+" and "+c+" is: "+avg);
    }
}
