package week7;
import java.util.Scanner;
import java.util.Arrays;

public class ANAGRAMCHECK{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1=input.nextLine();
        char arr1[]=s1.toCharArray();
        
        System.out.print("Enter String 2: ");
        String s2=input.nextLine();
        char arr2[]=s1.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)){
            System.out.print("\nTrue");
        }
        else{
            System.out.print("\nFalse");
        }
    }
}