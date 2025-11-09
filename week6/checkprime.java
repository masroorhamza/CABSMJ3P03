package week6;
public class checkprime {
    public static void main(String args[]) {
        int num=97, res=1;
        for(int i=2;i<=(num/2);i++){
            if(num%i==0){
                res=0;
                break;
            }
        }
        if(res==1){
            System.out.print(num+" is prime.");
        }
        else{
            System.out.print(num+" is composite.");
        }
    }
}
