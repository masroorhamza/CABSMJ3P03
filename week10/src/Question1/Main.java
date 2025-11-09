package Question1;

public class Main
{
    public static void main(String[] args)
    {
        Person p=new Person("Fahad", "8543869273");
        Person.Address a=p.new Address(13, "Gudri Bazar", "Ballia", "Uttar Pradesh");
        Person.DateofBirth dob=p.new DateofBirth("04", "12", "2003");
        p.display(a, dob);
    }
}