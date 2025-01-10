import java.util.*;

/*     PALINDROMIC PATTERN WITH NUMBERS
              1
             212
            32123
           4321234
          543212345

 */

public class palindromic_pattern_with_number {
    public static void  Palindromic_number(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces = n-1
            for(int j=1;j<=n-i;j++)
            {
                System.err.print(" ");
            }
            //numbers
            //1st for descending
            for(int j=i;j>=1;j--)
            {
                System.err.print(j);
            }
            //2nd ascending
            for(int j=2;j<=i;j++)
            {
                System.err.print(j);
            }
            System.err.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Palindromic_number(n);
    }
    
}
