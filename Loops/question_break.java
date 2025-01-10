//keep enter the number till user enter the multiple of 10
import java.util.*;
public class question_break {
   public static void main(Creation_string args[])
   {
     Scanner sc = new Scanner(System.in);
     do{
        System.out.print("Enter the number:");
        int number  = sc.nextInt();
        if(number % 10 == 0)
        {
            break;
        }
        System.out.print(number);
    }
    while(true);
    System.out.print("You entered the number which is multiple of 10");
   } 
}
