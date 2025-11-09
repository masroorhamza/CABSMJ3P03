package Question2;

public interface Account
{
    void withdraw();
    void deposit();
    
    static void aboutBank()
    {
        System.out.println("Static Method from Account:\nDetails about the Bank...");
    }
    
    default void takeLoan()
    {
        System.out.println("takeLoan from Account Interface.");
    }
}