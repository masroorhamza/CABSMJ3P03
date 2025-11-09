package week7;

public class binarysearch{
    public static int bs(int a[],int search){
        int s=0;
        int e=a.length-1;
        int m=(s+e)/2;
        while(s<=e){
            if(search==a[m]){
                break;
            }
            else if(search<a[m]){
                e=m-1;
            }
            else{
                s=m+1;
            }
            m=(s+e)/2;
        }
        if(s>e){
	    return -1;
	}
	else{
	    return m;
	}
    }
    public static void main(String[] args){
        int a[]={10,20,30,40,50,60,70,80,90,100};
        int x=80;
        int result=bs(a,x);
        if(result==-1){
            System.out.print(x+" was not found in the given array.");
        }
        else{
            System.out.print(x+" was found at index "+result);
        }
    }
}