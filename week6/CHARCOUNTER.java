package week6;
import java.util.Scanner;
import java.util.Arrays;

public class CHARCOUNTER{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=input.nextLine();
        s=s.toLowerCase();
        int len=s.length();
        int n[]=new int[26]; Arrays.fill(n, 0);     //sets every element of n as 0.
        char c[]=new char[26];
        for(int i=0;i<len;i++){
            if(Character.isAlphabetic(s.charAt(i))){
                int index=(int)s.charAt(i);
                c[index-97]=s.charAt(i);
                n[index-97]++;
            }
        }
        for(int i=0;i<26;i++){
            if(n[i]!=0){
                System.out.println("Frequency of \'"+c[i]+"\' is: "+n[i]);
            }
        }
    }
}