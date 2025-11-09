package week5;
import java.util.Scanner;

public class HEXATODECIMAL{
    //function to convert char into int:
    public static int convert(char c){
        if(Character.isUpperCase(c)){
            return ((int)c)-55;
        }
        else if(Character.isDigit(c)){
            return ((int)c)-48;
        }
        else return 0;
    }
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Hexadecimal Number: ");
        String hex=input.next();
        int len=hex.length()-1;
        double decimal=0, power=0;
        System.out.println(hex+" in decimal is: ");
        while(len!=-1){
            decimal+=(convert(hex.charAt(len))*(Math.pow(16.0, power)));
            power++;
            len--;
        }
        System.out.print(decimal);
    }
}