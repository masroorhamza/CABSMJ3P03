package week5;
import java.util.Scanner;

public class DECIMALTOHEXA{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n=input.nextInt();
        int d, x=n, l=0;
        while(x!=0){
            x/=16;
            l++;
        }
        char hex[]=new char[l]; l--;
        System.out.println(n+" in hexadecimal is: ");
        while(n!=0){
            d=n%16;
            if(d>9){
                hex[l]=(char)(d+55);
                l--;
            }
            else{
                hex[l]=(char)(d+48);
                l--;
            }
            n/=16;
        }
        System.out.print(hex);
    }
}