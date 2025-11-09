package week7;

public class stringpalindromecheck{
    public static void main(String[] args){
        String s=new String("racecar");
        int len=s.length();
        int i=0; int j=len-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                break;
            }
            i++;j--;
        }
        if(i<j){
            System.out.print("Not Palindrome.");
        }
        else{
            System.out.print("Palindrome.");
        }
    }
}