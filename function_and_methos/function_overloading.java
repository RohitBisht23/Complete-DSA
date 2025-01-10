//function overloading using parameters
import java.util.*;

import javax.swing.text.html.StyleSheet;
public class function_overloading {
    //sum of 3 number
    public static int function(int a,int b,int c)
    {
        return a+b+c;
    }
    //sum of 2 number
    public static int function(int a,int b)
    {
        return a+b;
    }
    public static void main(Creation_string args[])
    {
        // Scanner sc = new Scanner( System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // float d = sc.nextFloat();

        System.out.println(function(4,3));
        System.out.println(function(4,64,34));
    }
}
