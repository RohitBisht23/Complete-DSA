//check if number is prime or not
import java.util.*;
public class if_prime_or_not {
    // //APPROACH 1
    // public static boolean isPrime(int n)
    // {   boolean isPrime = true;
    //     for(int i=2;i<=n-1;i++)
    //     {
    //         if(n%i==0)
    //         {   
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    //APPROACH 2 (OPTIMIZE SOLUTION)
    public static boolean OPTIMIZE(int n)
    {  
        if(n==2)
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
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // System.out.println(isPrime(n));
        System.out.println(OPTIMIZE(n));
        
    }
}
