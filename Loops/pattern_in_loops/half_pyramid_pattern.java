//Print half pyramid patter
/*
 1
 12
 123
 1234
 */
import java.util.*;
public class half_pyramid_pattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int line = 1;line <=n; line++)
        {   //number print
            for(int number = 1; number <=line; number++)
            {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
