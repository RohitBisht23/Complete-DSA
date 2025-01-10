//continue statement
//keep enter the number and print if user dont enter the  multiple of 10
import java.util.*;
public class continue_statement {
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        do{
            System.err.println("Enter the number:");
            int number = sc.nextInt();
            if(number % 10 == 0)
            {
                continue;
            }
            System.out.println(number);
        }   
        while(true);
    }
}
