
import java.util.Scanner;

/*   DIAMOND PATTERN
        *
      * * *
    * * * * *
  * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
 */
public class Diamond_pattern {
    public static void Diamont(int n)
    {
        //first half
        for(int i=1;i<=n;i++)
        {
            //spaces->n-i
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars ->i+(i-1)
            for(int j=1;j<=i+(i-1);j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--)
        {
            //spaces->n-i
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars ->i+(i-1) / also can be used (2*i)-1
            for(int j=1;j<=i+(i-1);j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(Creation_string args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       Diamont(n);
    }
    
}
