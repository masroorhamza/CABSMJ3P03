package Question4;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }   
}

public class Main
{
    public static void vote(int age, String party) throws InvalidAgeException
    {
        if(age>17)
        {
            System.out.println("You voted for "+party);
        }
        else
        {
            throw new InvalidAgeException("You are a Minor, you can't vote yet!!!");
        }
    }
    
    public static void main(String[] args)
    {
        String p1="Party-1";
        String p2="Party-2";
        
        int age1=24;
        int age2=15;
        
        try
        {
            vote(age1, p2);
            vote(age2, p1);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}