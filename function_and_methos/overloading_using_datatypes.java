//function overloading using data types
public class overloading_using_datatypes {
   //sum of 2integers number
    public static int function(int a,int b)
    {
        return a+b;
    }
    //sum of 2 floating number
    public static float function(Float a,Float b)
    {
        return a+b;
    }
    public static void main(Creation_string args[])
    {
        System.out.println(function(4,3));
        System.out.println(function(4.4f,34.5f));
    }
}

