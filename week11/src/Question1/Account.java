package Question1;

public interface Account
{
    void withdraw();
    void deposit();
    
    static void aboutBank()
    {
        System.out.println("Static Method from Account:\nDetails about the Bank...");
    }
}