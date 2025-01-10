/*
Tribonacci Numbers
The Tribonacci series is s generalization of the fabonacci sequence where each term is the sum of the
three preceding terms.
a(n) = a(n-1) + a(n-2) + a(n-3) with a(0)=a(1)=0, a(2) = 1

Example-> input=5
          output=0,0,1,1,2
 */
import java.util.*;
public class Question1 {
    /* 
    public static int Tribonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return 0;
        }

        if(n == 2)
        {
            return 1;
        }

        return Tribonacci(n-1) + Tribonacci(n-2) + Tribonacci(n-3);
    }

    */

    /* 
    public static int memoization(int n,int dp[])
    {
        if(n == 0 || n == 1)
        {
            return 0;
        }

        if(n == 2){
            return 1;
        }

        if(dp[n] != -1)
        {
            return dp[n];
        }

        dp[n] = memoization(n-1,dp) + memoization(n-2,dp) + memoization(n-3,dp);
        return dp[n];
    }
    */

    public static void tabulation(int n)
    {
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 0;
        dp[2] = 1;

        for(int i=3; i<=n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for(int i=0; i<n; i++)
        {
            System.err.print(dp[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int n = 5;
        // Tribonacci(n);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(Tribonacci(i) + " ");
        // }

        //Memoization code
        /* 
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = memoization(n, dp);
        for (int i = 0; i < n; i++) {
            int value = memoization(i, dp);
            System.err.print(value + " ");
        }
        */

        tabulation(n);
    }
}