//Multiple inheritace using interfaces

public class MultiPLe_inheritance_using_interfaces {
    public static void main(String agrs[])
    {
        Bear b = new Bear();
        b.eat();
        b.Eat();
    }
}
interface Hernivore
{
    void eat();//grass
}
interface Carnivore
{
    void Eat();//meat
}
class Bear implements Hernivore,Carnivore
{
    public void eat()
    {
        System.out.println("Eats both");
    }
    public void Eat()
    {
        System.out.println("Eat meat");
    }
}
