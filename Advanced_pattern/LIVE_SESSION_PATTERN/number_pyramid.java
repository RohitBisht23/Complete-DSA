import java.util.*;

/*   NUMBER PYRAMID
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
 
 */

public class number_pyramid {
    public static void NumberPyramid(int n)
    {   
        for(int i=1;i<=n;i++)
        {
            //spaces = n-i;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //printing
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.err.println();
           
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NumberPyramid(n);
    }
    
}
