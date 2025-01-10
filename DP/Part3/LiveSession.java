/*
Coin change(Live class).
ex: 
coins[] = 1,2,3
sum = 4
output:{1,1,1,1},{1,1,2},{2,2},{1,3}.
 */
public class LiveSession {
    public static int waysToChangeCoins(int arr[],int sum)
    {
        int n = arr.length;
        int dp[][] = new int[n+1][sum+1];
        
        for(int i=0; i<n+1; i++)
        {
            dp[i][0] = 1;
        }

        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<sum+1; j++)
            {
                int coin = arr[i-1];

                if(coin <= j)
                {
                    int include = dp[i][j-coin];
                    int exclude = dp[i-1][j];

                    dp[i][j] = include + exclude;
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }

    public static void print(int[][]dp)
    {
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                System.err.print(dp[i][j]+" ");
            }
            System.err.println();
        }
    }
    public static void main(String[] args)
    {
        int coins[] = {1,2,5};
        int sum = 11;
        System.err.println("Total number of ways are:"+waysToChangeCoins(coins,sum));
    }
}
