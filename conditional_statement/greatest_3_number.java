//greatest of 3 numbers
import java.util.*;
public class greatest_3_number {
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int A = sc.nextInt();
        System.out.print("Enter the second number:");
        int B = sc.nextInt();
        System.out.print("Enter the third number:");
        int C = sc.nextInt();
        if((A>B)&&(A>C))
        {
            System.out.println("A is largest number");
        }
        else if((B>A)&&(B>C))
        {
            System.out.println("B is largest number");
        }
        else
        {
            System.out.println("C is largest number");
        }
    }
}
