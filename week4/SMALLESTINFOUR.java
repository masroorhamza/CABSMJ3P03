package week4;

public class SMALLESTINFOUR{
    public static void main(String[] args){
        int a=340, b=85, c=539, d=74;
        int smallest=a<b? (a<c? (a<d? a:d):(c<d? c:d)):(b<c? (b<d? b:d):(c<d? c:d));
        if(smallest==a){
            System.out.print("a is the smallest with value: "+a);
        }
        else if(smallest==b){
            System.out.print("b is the smallest with value: "+b);
        }
        else if(smallest==c){
            System.out.print("c is the smallest with value: "+c);
        }
        else{
            System.out.print("d is the smallest with value: "+d);
        }
    }
}
