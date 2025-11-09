package week6;

public class swapextremes{
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        int len=5;
        System.out.println("Array before swapping:");
        for(int i=0;i<5;i++){
            System.out.print(array[i]+" ");
        }
        //swapping first and last value of array using its length's index:
        int temp=array[0];
        array[0]=array[len-1];
        array[len-1]=temp;
        System.out.println("\nArray before swapping:");
        for(int i=0;i<5;i++){
            System.out.print(array[i]+" ");
        }
    }
}
