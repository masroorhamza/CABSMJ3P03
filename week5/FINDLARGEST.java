package LabHamza;

public class findlargest{
    public static void main(String[] args){
        int[] array={5,3,55,986,34};
        int largest=0;
        for(int i=0;i<5;i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        System.out.print("Largest in the array is: "+largest);
    }
}
