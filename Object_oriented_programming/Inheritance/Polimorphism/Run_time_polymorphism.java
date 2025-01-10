//Function overrinding (Run tim epolymorphism or dynamic polymorphism)
public class Run_time_polymorphism {
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.eat();
        
    }
}
class Animal
{
    void eat()
    {
        System.out.println("Animal eat grass");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("Dog eat chapati");
    }
}