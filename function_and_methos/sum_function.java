//parameterized function
//Sum of a and b
import java.util.*;
public class sum_function{
    public static int  CalculateSum(int a, int b)//parameters or formal parameters
    {
        int Sum = a + b;
        
        return Sum;
    }
    public static void main(Creation_string args[])  
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Sum = CalculateSum(a,b);//arguments or actual parameters
        System.out.println("Sum of a and b is:" +Sum);
    }
   
}
