package Question2;

public class Main
{
    public static void main(String[] args)
    {
        Edible e=new Edible();
        Edible.Fruit f=new Edible.Fruit ();
        Edible.Vegetable v=new Edible.Vegetable ();
        
        Edible.Fruit.FruitDetails();
        f.FruitPackaging();
        Edible.Vegetable.VegDetails();
        v.VegPackaging();
    }
}