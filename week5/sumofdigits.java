package week5;
import java.util.Scanner;

public class sumofdigits{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num=input.nextInt();
        int lsd, sum=0;
        while(num!=0){
            lsd=num%10;
            sum+=lsd;
            num/=10;
        }
        System.out.print("Sum of all digits is: "+sum);
    }
}
