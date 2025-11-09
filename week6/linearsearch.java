package week6;

public class linearsearch{
    public static void main(String[] args){
        int[] array={2,43,7,80,4,32,86,5,56,23};
        int len=10;
        int result, search=31;
        for(int i=0;i<len;i++){
            if(array[i]==search){
                System.out.println("Value "+search+" was found at index: "+i);
                len=1;
                break;
            }
        }
        if(len!=1){
            System.out.print(search+" isn't present in the given array.");
        }
    }
}
