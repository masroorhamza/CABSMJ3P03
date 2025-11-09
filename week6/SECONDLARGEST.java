package week6;

public class SECONDLARGEST{
    public static void main(String[] args){
        int[] array={23,5,650,75,95,345,78,43,522,244};
        int len=10;
        int big=array[0]; int result=0;
        for(int i=0;i<len;i++){
            if(array[i]>big){
                big=array[i];
            }
            else if(array[i]>result){
                result=array[i];
            }
        }
        System.out.print("Second largest element of the array is: "+result);
    }
}