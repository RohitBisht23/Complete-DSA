//Finding binomial coefficient
import java.util.*; 
public class binomial_coefficient {
    public static int factorial(int n) {
        int f = 1;
        for(int i=1;i<=n;i++)
        {
            f *= i;
        }
        return f;
        
    }
    public static int binomial_coefficient(int n,int r)
    {
        int n_factorial = factorial(n);
        int r_factorial = factorial(r);

        int n_m_r_factorial = factorial(n-r);
        int BC = n_factorial/(r_factorial*n_m_r_factorial);
        return BC;
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value n:");
        int n = sc.nextInt();
        System.out.print("Enter the value r:");
        int r = sc.nextInt();
        int binomial = binomial_coefficient(n,r);
        System.out.println("Binomial coefficient is:"+binomial);
    }

}
