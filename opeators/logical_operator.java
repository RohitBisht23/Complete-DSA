//Logiacal operator

public class logical_operator {
    public static void main(Creation_string args[])
    {
        int a = 10;
        int b = 10;
        int c = 14;
        //&&  Logical AND
        System.out.println("Logical AND:"+((a==b)&&(a < c)));
        //|| Logican OR
        System.out.println("Logical OR:"+((a>b)||(c<b)));
        //! Logical NOT
        System.out.println("a greater than "+(!(a==c)));
    }
}
