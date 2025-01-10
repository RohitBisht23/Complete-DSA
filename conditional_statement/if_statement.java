//Conditional statements
//if else statement
import java.util.*;
public class if_statement {
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("You are adult you can drive now");
        }
        else
        {
            System.out.println("You cannot drive,you are not drive");
        }
    }
}
