//Heirarichal inheritance
public class Heirarichal_inheritance {
    public static void main(String args[])
    {
        Bird b = new Bird();
        b.color = "black";
        System.out.println(b.color);
        b.Breathe();

        Mammal m = new Mammal();
        m.eat();
    }
}
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eats");
    }
    void Breathe()
    {
        System.out.println("Breathes");
    }
}
class Mammal extends Animal
{
    void walk()
    {
    System.out.println("Walks");
    }
}
class Bird extends Animal
{
    void fly()
    {
    System.out.println("Fly");
    }    
}

