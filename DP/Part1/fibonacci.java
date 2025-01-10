//Recursion based code
public class fibonacci {
    //Memoization process
    /* 
    public static int fabinacci(int n,int f[])
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        if(f[n] != 0)//fib(n) is already calculated
        {
            return f[n];
        }

        f[n] = fabinacci(n-1,f) + fabinacci(n-2,f);
        return f[n];
    }
    */

    //tabulation
    public static int fabinacci(int n)
    {
        int dp[] = new int[n+1];
        dp[1] = 1;

        for(int i=2; i<=n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args)
    {
        int n = 10;
        int f[] = new int[n+1];
        // System.err.println(fabinacci(n,f));
        System.err.println(fabinacci(n));
    }
}
