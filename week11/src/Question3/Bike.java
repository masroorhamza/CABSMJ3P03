package Question3;

public interface Bike
{
    void offer();
    
    default void details()
    {
        System.out.println("Details from Bike");
    }
}