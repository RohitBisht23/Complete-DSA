import java.util.Scanner;

/*INVERTED AND ROTATED HALF PYRAMID
        *
      * *
    * * *
  * * * *
 */
public class Inverted_and_half_pyramid {
    public static void inverted_rotated_half_pyramid(int row)
    {
        for(int i=1;i<=row;i++)
        {
            //for spaces
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++)
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
        inverted_rotated_half_pyramid(n);
    }
}
