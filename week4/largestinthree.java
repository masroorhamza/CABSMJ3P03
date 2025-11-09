package week4;

public class largestinthree{
    public static void main(String[] args){
        int a=256, b=43, c=172;
        int largest=a>b? (a>c? a:c):(b>c? b:c);
        if(largest==a){
            System.out.print("a is largest with value: "+a);
        }
        else if(largest==b){
            System.out.print("b is largest with value: "+b);
        }
        else{
            System.out.print("c is largest with value: "+c);
        }
    }
}
