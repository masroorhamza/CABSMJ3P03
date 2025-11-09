package week5;

public class NUMREV {
    public static void main(String args[]) {
        int num=123456, temp=num;
        int d; int rev=0;
        while(temp!=0){
            d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        System.out.print("The reverse of "+num+" is: "+rev);
    }
}
