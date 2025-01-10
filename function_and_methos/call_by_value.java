//call by value 
public class call_by_value {
    public static void call_by_value(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after capying a :"+a);
        System.out.println("after capying b :"+b);


    }
    public static void main(Creation_string args[])
    {
        int a = 10;
        int b = 5;
        call_by_value(a,b);
        System.out.println("before argument a passed:"+a);
        System.out.println("before argument b passed:"+b);

    } 
}
