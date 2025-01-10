import java.util.Scanner;

/*   Butterfly trying with second approach
     *             *
     * *         * *
     * * *     * * *
     * * * * * * * *
     * * * * * * * *
     * * *     * * *
     * *         * *
     *             *
 */

public class Butterfly_second_Approach {
    public static void Butterfly(int n)
    {
        for(int i=1;i<=n;i++)
        {   //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // System.out.print(" ");
            // for(int j=i;j>=1;j--)
            // {
            //     System.out.print("*");
            // }

            // //spaces
            // for(int j=1;j<=n-i;j++)
            // {
            //     System.out.print(" ");
            // }
            // //spaces
            // for(int j=1;j<=n-i;j++)
            // {
            //     System.out.print(" ");
            // }
            // //stars
            // for(int j=i;j>=1;j--)
            // {
            //     System.out.print("*");
            // }
            // System.out.println();
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Butterfly(n);
    }
}
