import java.util.Scanner;

/*   HELLOW RHOMBUS
            * * * * *
          *       *
        *       *
      *       *
    * * * * *

 */
public class Hellow_rhombus {
    public static void HellowRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces-n-i
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars-n
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        HellowRhombus(n);

    }
    
}
