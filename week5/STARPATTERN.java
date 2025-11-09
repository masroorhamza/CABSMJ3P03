package LabHamza;

public class STARPATTERN{
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i+j<2){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(j<=i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}