package week6;

public class maxandminvalue{
    public static void main(String[] args){
        int[] array={2,43,7,86,4,32,86,5,56,23};
        int len=10;
        int max=array[0], min=array[0];
        for(int i=0;i<len;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Maximum value in the array is: "+max);
        System.out.println("Minimum value in the array is: "+min);
    }
}