package week4;
import java.util.Scanner;

public class ISLEAPYEAR{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year=input.nextInt();
        int ans=0;
        if(year%4==0 && (year%100==0 && year%400==0)){
            ans=1;
        }
        if(ans==1){
            System.out.print(year+" is a leap year.");
        }
        else{
            System.out.print(year+" is not a leap year.");
        }
    }
}