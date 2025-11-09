package week6;
public class primetillhundred{
    public static void main(String[] args){
        System.out.println("Prime numbers from 1-100 are:");
        for(int i=1;i<=100;i++){
            int x=1;
            for(int j=2;j<=i;j++){
                if(x>2){
                    continue;
                }
                else if(i%j==0){
                    x++;
                }
            }
            if(x<3){
                System.out.print(i+" ");
            }
        }
    }
}