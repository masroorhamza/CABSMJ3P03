package Question4;

public class MultiFunctionMachine implements Printer, Scanner
{
    public void connect()
    {
        System.out.println("Printer and Scanner connected.");
    }
    
    public void details()
    {
        System.out.println("Details method from MultiFunctionMachine: ");
        Printer.super.details();
        Scanner.super.details();
    }
}