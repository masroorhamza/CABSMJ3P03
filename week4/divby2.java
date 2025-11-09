package week4;
import java.util.Scanner;

public class divby2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        double num=input.nextDouble();
        double res=num/2;
        while(res>10){
            System.out.println(res);
            res/=2;
        }
    }
}
