/*
Climbing stair tabulation approach(more optimize(DP))
 */

public class tabulation {
    public static int countWays(int n)
    {
        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i=1; i<=n; i++)
        {
            if(i == 1)
            {
                dp[i] = dp[i-1] + 0;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args)
    {
        int n = 6;
        System.err.println("Total ways:"+countWays(n));
    }
}
