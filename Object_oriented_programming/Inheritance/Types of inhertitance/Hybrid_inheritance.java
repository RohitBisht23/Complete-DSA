public class Hybrid_inheritance {
    public static void main(String agrs[])
    {
        Cat c = new Cat();
        c.breathe();
        c.color = "black";
        System.out.println(c.color);
    }
}
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eat");
    }
    void breathe()
    {
        System.out.println("Breathe");
    }
}
class Mammal extends Animal
{
    void walk()
    {
        System.out.println("Walks");
    }
}
class Dog extends Mammal
{
    String breed;
    void run()
    {
        System.out.println("Run faster");
    }
}
class Cat extends Mammal
{
    void jump()
    {
        System.err.println("5 fits");
    }
}
class Human extends Mammal
{
    String name;
    void citizen()
    {
        System.out.println("Indian");
    }
}
