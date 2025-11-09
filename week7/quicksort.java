package week7;
import java.util.Scanner;

public class quicksort
{
    public static void swap(int a[], int x, int y)
    {
        int t=a[x];
        a[x]=a[y];
        a[y]=t;
    }
    
    public static int partition(int a[], int l, int h)
    {
        int pivot=a[h];
        int i=(l-1);
        for(int j=1;j<h;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,h);
        return i+1;
    }
    
    public static void sort(int a[], int l, int h)
    {
        if(l<h)
        {
            int p=partition(a,l,h);
            
            sort(a,l,p-1);
            sort(a,p+1,h);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=input.nextInt();
        }
        System.out.println("\nEntered Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        sort(a,0,n-1);
        
        System.out.println("\nArray after sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}