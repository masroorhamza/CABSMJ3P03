package week7;
import java.util.Scanner;

public class fibonacci_rec{
    public static int nth_fibonacci(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return (nth_fibonacci(n-1)+nth_fibonacci(n-2));
        }
    }
    
    public static void printfibonacci(int n){
        for(int i=1;i<=n;i++){
            System.out.print(nth_fibonacci(i)+" ");
        }
    }
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter nth term: ");
        int n=input.nextInt();
        printfibonacci(n);
    }
}