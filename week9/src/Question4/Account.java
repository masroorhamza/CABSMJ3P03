package Question4;

abstract class Account
{
    String Id;
    String Account_holder_name;
    String Address;
    
    Account()
    {
        Id="ABC9876";
        Account_holder_name="XYZ";
        Address="Aligarh, India";
    }
    
    void display()
    {
        System.out.println("\nAccount Details: ");
        System.out.println("Account Id: "+Id);
        System.out.println("Account Holder Name: "+Account_holder_name);
        System.out.println("Address: "+Address);
    }
    
    abstract void deposit();
    
    abstract void withdraw();
}