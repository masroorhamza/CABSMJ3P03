package Desktop;
import java.util.Scanner;

public class DIVISION{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend=input.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor=input.nextInt();
        
        int q=dividend/divisor;
        int rem=dividend%divisor;
        System.out.println("When "+dividend+" is divided by "+divisor+":");
        System.out.println("Qoutient is: "+q);
        System.out.print("Remainder is: "+rem);
    }
}