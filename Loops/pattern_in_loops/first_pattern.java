import java.security.PublicKey;

/*
 PRINT THE PATTERN
 *
 * *
 * * *
 * * * *
 */
import java.util.*;
public class first_pattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        for(int line = 1; line <=n;line++)
        {

            //one line
            for(int star =1;star <= line; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
