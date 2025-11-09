package Question3;

public interface Scooty
{
    void offer();
    
    default void details()
    {
        System.out.println("Details from Scooty");
    }
}