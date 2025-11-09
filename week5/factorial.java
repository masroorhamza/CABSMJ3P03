package week5;

public class factorial {
    public static void main(String args[]) {
        int num=10; int fact=num;
        for(int i=2;i<num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
