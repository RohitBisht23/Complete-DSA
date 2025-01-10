/*In a program, inout 3 numbers:a ,b and c. You have to output the average
 * os these 3 numbers
 */
import java.util.Scanner;
import java.util.*;
public class question1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println(average);

    }
    
}
