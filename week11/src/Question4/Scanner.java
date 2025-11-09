package Question4;

public interface Scanner
{
    void connect();
    
    default void details()
    {
        System.out.println("details method from Scanner Interface.");
    }
}