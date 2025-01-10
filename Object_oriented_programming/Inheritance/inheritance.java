//Inheritance
public class inheritance {
    public static void main(String args[])
    {
        Fish shark = new Fish();
        shark.eat();
    }
}
//Base class/Parent class/super class
class Animal{
    String Color;
    void eat()
    {
        System.out.println("Eats");
    }
    void breathe()
    {
        System.out.println("Breathe");
    }
}
//Derived class / subclass/ child class
class Fish extends Animal{//all properties are derived in child class
    int fins;
    void swim()
    {
        System.out.println("Swim in water");
    }
}
