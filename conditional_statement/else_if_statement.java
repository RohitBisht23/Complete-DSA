//Else if statement
//income tax calculator
import java.util.*;
public class else_if_statement {
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income:");
        int income = sc.nextInt();
        int tax;
        if(income < 500000)
        {  
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000)
        {  
            tax = (int) (income*.2f);
        }
        else
        {
            tax = (int) (income*.3f);
        }
        System.out.print("Your tax is:"+tax);

    }
}
