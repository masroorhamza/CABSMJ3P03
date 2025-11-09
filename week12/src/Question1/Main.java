package Question1;

public class Main
{
    public static double sqrt(double num) throws ArithmeticException
    {
        return Math.sqrt(num);
    }
    
    public static void main(String[] args)
    {
        double[] arr={2.0, 4.5, -3.7, 3.9};
        
        for(int i=0; i<arr.length; i++)
        {
            try
            {
                System.out.println("Square root of "+arr[i]+" is: "+sqrt(arr[i]));
            }
            catch(ArithmeticException e)
            {
                //Math.sqrt() itself sends an error message!
            }
        }
    }
}