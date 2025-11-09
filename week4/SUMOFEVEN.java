package week4;
import java.util.Scanner;

public class SUMOFEVEN{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter upper limit of range for even numbers: ");
        n=input.nextInt();
        for(int i=2;i<=n;i=i+2){
            sum+=i;
        }
        System.out.print("Sum of all even number upto "+n+" is: "+sum);
    }
}
