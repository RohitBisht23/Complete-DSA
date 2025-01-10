//print the largest number of 2
import java.util.*;
public class Question1 {
   public static void main(Creation_string args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number:");
    int A = sc.nextInt();
    System.out.print("Enter the second number:");
    int B = sc.nextInt();
    if(A > B)
    {
        System.out.println("A is largest than B");
    }
    else
    {
        System.out.println("B is largest than A");
    }
   } 
}
