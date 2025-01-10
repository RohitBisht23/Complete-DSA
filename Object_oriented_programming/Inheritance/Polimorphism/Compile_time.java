//Function overloading

public class Compile_time {
    public static void main(String args[])
    {
        Calculator add = new Calculator();
        System.out.println(add.sum(34,65));
        System.out.println(add.sum((float)3.4, (float)5.4));
        System.out.println(add.sum((float)2.3, (float)0.3, (float)4.3));
    }
}
class Calculator{
    int sum(int a,int b)
    {
        return a + b;
    }

    float sum(float a,float b)
    {
        return a + b;
    }
    
    float sum(float a,float b,float c)
    {
        return a + b + c;
    }
}
