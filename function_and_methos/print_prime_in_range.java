import java.util.Scanner;

//Print prime in a range
public class print_prime_in_range {
    public static boolean isPrime(int n)
    {   if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void prineRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the range:");
        int range = sc.nextInt();
        prineRange(range);
    }
}
