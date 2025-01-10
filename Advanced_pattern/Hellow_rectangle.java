import java.util.*;


/*
                  * * * * *
                  *       *
                  *       *
                  *       *
                  * * * * *
 */

public class Hellow_rectangle {
    public static void HellowPattern(int row,int col)
    {   System.out.println("THE REQUIRED PATTERN IS:");
        for(int i =1; i<=row; i++)
        {
            for(int j = 1; j<=col; j++)
            {
                if(i==1 || i==row || j==1 ||j==col)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows number:");
        int row = sc.nextInt();
        System.out.println("Enter the columns number:");
        int col = sc.nextInt();

        
        HellowPattern(row,col);

        
    }
}
