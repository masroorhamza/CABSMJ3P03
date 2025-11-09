package week6;
import java.util.Scanner;

public class FIBONACCISERIES{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=input.nextInt();
        int term1=0;
        int term2=1;
        int term3=0;
        System.out.print("Fibonacci Series upto "+n+" terms are: "+term1+" "+term2+" ");
        for(int i=0;i<n-2;i++){
            term3=term2+term1;
            term1=term2;
            term2=term3;
            System.out.print(term3+" ");
        }
    }
}