import java.util.Scanner;

/*  INVERTED HALF PYRAMID WITH NUMBERS
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

 */
public class inverted_pyramid_half_with_numbers {
    public static void inverted_half_pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inverted_half_pyramid(n);
    }
}
