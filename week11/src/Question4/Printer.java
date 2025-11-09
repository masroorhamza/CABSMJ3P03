package Question4;

public interface Printer
{
    void connect();
    
    default void details()
    {
        System.out.println("details method from Printer Interface.");
    }
}