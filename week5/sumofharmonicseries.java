package week5;
import java.util.Scanner;

public class sumofharmonicseries{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n for nth term of the harmonic series: ");
        int n=input.nextInt();
        double sum=0;
        for(double i=1.0;i<=n;i++){
            double x=1/i;
            sum+=x;
        }
        System.out.print("Sum of first "+n+" terms of harmonic series is: "+sum);
    }
}