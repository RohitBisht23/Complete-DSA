//Super keyword
public class Super_keyword {
    public static void main(String agrs[])
    {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}
class Animal
{
    String color;
    Animal()
    {
        System.out.println("Parent contructor is called");
    }
}
class Horse extends Animal
{
    Horse()
    {
        // super();
        super.color = "Brown";
        System.out.println("Child constructor is called");
    }
}
