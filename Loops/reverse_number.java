import java.util.Scanner;

//reverse the number
import java.util.*;
public class reverse_number {
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner( System.in);
        System.err.println("Enter the number:");
        int number = sc.nextInt();
        int rev = 0;
        while(number > 0)
        {
            int lastdigit= number%10;
            rev = (rev*10)+lastdigit;
            number = number/10;
        }
        System.out.print(rev);
    }
}
