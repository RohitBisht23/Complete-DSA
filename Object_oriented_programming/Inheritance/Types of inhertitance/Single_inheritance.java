//Single Level inheritance

public class Single_inheritance {
    public static void main(String args[])
    {
        Derived d = new Derived();
        d.func2();
        d.func();
    }
}
//Base class
class Base{
    void func()
    {
        System.out.println("Base class");
    }
}
//Derived class
class Derived extends Base{
    void func2()
    {
        System.out.println("Derived class");
    }
}
