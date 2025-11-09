package Question1;

public class Person
{
    String name;
    String phone;

    public Person(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
        
    }
    
    public class Address
    {
        int House_No;
        String Street;
        String City;
        String State;

        public Address(int House_No, String Street, String City, String State)
        {
            this.House_No = House_No;
            this.Street = Street;
            this.City = City;
            this.State = State;
        }
        
        void displayAddr()
        {
            System.out.print("Address: ");
            System.out.println(House_No+", "+Street+", "+City+", "+State+".");
        }
    }
    
    public class DateofBirth
    {
        String day;
        String month;
        String year;

        public DateofBirth(String day, String month, String year)
        {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        
        void displayDOB()
        {
            System.out.println("Date of Birth(DD/MM/YYYY) : "+day+"/"+month+"/"+year);
        }
    }
    
    void display(Address a, DateofBirth dob)
    {
        System.out.println("Person Details: ");
        System.out.println("Name: "+name+"\nPhone: "+phone);
        a.displayAddr();
        dob.displayDOB();
    }
}