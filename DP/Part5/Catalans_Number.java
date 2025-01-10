/*
Catalan's Number
C0 = 1;
C1 = 1;
C2 = c0.c1 + c1.c0 = 1*1+1*1 = 2
 */
import java.util.*;
public class Catalans_Number {
    //recursion code
    public static int catalanRec(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        int ans = 0;
        for(int i = 0; i<=n-1; i++)
        {                          //n-1
            ans += catalanRec(i) * catalanRec(n-i-1);
        }
        return ans;
    }

    public static int catalanMemoization(int n,int dp[])
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        if(dp[n] != -1)
        {
            return dp[n];
        }

        int ans = 0;
        for(int i=0; i<=n-1; i++)
        {
            ans += catalanMemoization(i,dp) * catalanMemoization(n-i-1,dp);
        }
        return dp[n] = ans;
    }
    public static void main(String[] args)
    {
        // int n = 4;
        // System.err.println("Catalan's of n is:"+catalanRec(n));

        //memoization
        int m = 5;
        int dp[] = new int[m+1];
        Arrays.fill(dp,-1);
        System.err.println(catalanMemoization(m, dp));
    }
}
