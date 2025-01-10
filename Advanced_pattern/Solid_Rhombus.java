import java.util.Scanner;

/*   SOLID RHOMBUS
            * * * * *
          * * * * *
        * * * * *
      * * * * *
    * * * * *
 */
public class Solid_Rhombus {
    public static void SolidRombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces - n-i
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars - n
            for(int j=1;j<=n;j++)
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
        SolidRombus(n);
    }
}
