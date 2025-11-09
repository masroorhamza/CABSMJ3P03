package week5;
import java.util.Scanner;

public class arrayinput{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int array[]=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter Integer-"+(i+1)+": ");
            array[i]=input.nextInt();
        }
        System.out.print("Entered Integers are: ");
        for(int i=0;i<3;i++){
            System.out.print(array[i]+" ");
        }
    }
}
