//Odd even number program
import java.util.*;
public class odd_even {
  public static void main(Creation_string args[]) 
  {
    Scanner sc = new Scanner (System.in);
    System.err.println("Enter the number:");
    int number = sc.nextInt();
    if(number % 2 == 0)
    {
        System.err.println("Number is even");
    }
    else
    {
        System.err.println("Number is odd");
    }
   } 
}
