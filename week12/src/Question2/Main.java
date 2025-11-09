package Question2;
import java.io.*;

public class Main
{
    public static void f1()
    {
        try
        {
            f2();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("FileNotFoundException Occured!!");
        }
    }
    
    public static void f2() throws FileNotFoundException
    {
        f3();
    }
    
    public static void f3() throws FileNotFoundException
    {
        FileReader f=new FileReader("abc.txt");
    }
    
    public static void main(String[] args)
    {
        f1();
    }
}