package week5;

public class numpattern{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            int x=1;
            for(int j=0;j<5;j++){
                if(i+j<4){
                    System.out.printf(" ");
                }
                else{
                    System.out.printf("%d",x);
                    x++;
                }
            }
            System.out.printf("\n");
        }
    }
}