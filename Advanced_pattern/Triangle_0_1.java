import java.util.Scanner;

/*   0-1 TRIANGLE
     1
     0 1
     1 0 1
     0 1 0 1
     1 0 1 0 1

 */
public class Triangle_0_1 {
    public static void Triangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }else
                {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle(n);
    }
    
}
