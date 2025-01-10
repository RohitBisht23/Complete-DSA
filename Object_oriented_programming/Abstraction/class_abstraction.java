//Class abstraction

public class class_abstraction {
    public static void main(String args[])
    {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
    
        // h.changeColor();
        // System.out.println(h.skinColor);

        System.out.println(h.skinColor);//Gives brown bcos it set be default brown
    }
}
abstract class Animal
{    String skinColor;
    //Constructor
    Animal()
    {
        skinColor = "Brown";
    }
    //Non abtract methos/function
    void eat()
    {
        System.out.println("Animal eat");  
    }
    //Abract method function
    abstract void walk();//abtract method does not have its implementation
}
class Horse extends Animal
{   
    void changeColor()
    {
        skinColor = "dark-black";
    }
    void walk()
    {
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal
{   
    void changeColor()
    {
        skinColor = "Yellow";
    }

    void walk() {
        System.out.println("walk on 2 legs");
    }
}
