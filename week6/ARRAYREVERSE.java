package week6;

public class ARRAYREVERSE{
    public static void main(String[] args){
        int[] arr={2,4,6,8,10,12,14,16,18};
        int len=9;
        System.out.println("Array before reversing:");
        for(int x=0;x<len;x++){
            System.out.print(arr[x]+" ");
        }
        int i=0, j=len-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        System.out.println("\nArray after reversing:");
        for(int x=0;x<len;x++){
            System.out.print(arr[x]+" ");
        }
    }
}