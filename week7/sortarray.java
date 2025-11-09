package week7;

public class sortarray{
    //insertion sort function in ascending order:
    public static void sort(int a[]){
        int index=1;
        while(index!=a.length){
            for(int i=0;i<index;i++){
                if(a[index]<a[i]){
                    int tmp=a[index];
                    a[index]=a[i];
                    a[i]=tmp;
                }
            }
            index++;
        }
    }
    public static void main(String[] args){
        int a[]={23,64,86,3,54,29,16,82,469,0};
        System.out.println("Array before sorting:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        sort(a);
        System.out.println("\nArray after sorting:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}