package Opt5;

public class Student 
{
    int rollNo;
    String name;
    int marks;
    static String schoolName;
   
    public void changeSchoolName(String school)
    {
        this.schoolName=school;
    }
    
    void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("School: "+schoolName);
    }
}