package Question5;

public class Main
{
    public static void main(String[] args)
    {
        FRUIT banana1=new FRUIT();
        banana1.display();
        
        FRUIT banana2=new FRUIT("Yellow");
        banana2.display();
        
        FRUIT banana3=new FRUIT("Sweet", 50);
        banana3.display();
        
        FRUIT  banana=new FRUIT("Yellow", "Sweet", 50);
        banana.display();
    }
}