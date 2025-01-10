//product of a and b
import java.util.*;
public class pruduct_a_and_b {
    public static int multiply(int a,int b)
    {
        int product  = a *b;
        return product;
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.print("a*b="+prod); 
    }
}
