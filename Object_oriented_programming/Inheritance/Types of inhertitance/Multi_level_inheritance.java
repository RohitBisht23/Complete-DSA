//Multi level inheritance

public class Multi_level_inheritance {
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.eat();;
        d.color = "Black";
        System.out.println(d.color);
    }
}
//Base class
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eat");
    }
    void Breathe()
    {
        System.out.println("Breathe");
    }
}
//Derived class
class Mammals extends Animal
{
    int legs;
}
//Derived from Mammal class
class Dog extends Mammals
{
    String breed;
}
