import java.util.Scanner;

//factorial 
public class factorial {
    public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int  n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("factorial of n is:"+factorial);
    }
}
