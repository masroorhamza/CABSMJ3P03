package week4;
import java.util.Scanner;

public class PRINTFACTORS{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=input.nextInt();
        System.out.println("Factors of "+n+" are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
