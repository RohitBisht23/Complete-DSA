//calculatos
import java.util.*;
public class calculator {
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value a:");
        int a = sc.nextInt();
        System.out.print("Enter the value b:");
        int b = sc.nextInt();
        System.out.print("Enter the required operator:");
        char operator = sc.next().charAt(0);
        switch(operator)
        {
            case '+': System.out.print(a+b);
                    break;
            case '-': System.out.print(a-b);
                    break;
            case '*': System.out.print(a*b);
                    break;
            case '/': System.out.print(a/b);
                    break;
            case '%': System.out.print(a%b);
                    break;
            default:System.out.print("Wron operation");
        }
    }
}
