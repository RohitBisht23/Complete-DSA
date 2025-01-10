//ternary question
//check the student pass or not
import java.util.*;
public class ternary_question {
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number = sc.nextInt();
        Creation_string type = ((number >= 33)?"Pass":"Fail");
        System.out.print(type);

    }
}
