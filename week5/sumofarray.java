package week5;

public class sumofarray{
    public static void main(String[] args){
        int[] array={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=array[i];
        }
        System.out.print("Sum of all elements of the array: "+sum);
    }
}