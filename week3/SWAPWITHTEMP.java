package Desktop;

public class SWAPWITHTEMP{
    public static void main(String[] args){
        int a=5, b=7;
        System.out.println("a = "+a+" b = "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: ");
        System.out.print("a = "+a+" b = "+b);
    }
}
