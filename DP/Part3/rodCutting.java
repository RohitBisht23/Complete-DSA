/*
Rod Cutting
Given a rod of length n inches and an array of prices that includes prices of all pieces of size smaller
than n. Detemine the maximum value obtainable by cutting up the rod and setting the pieces.
Example:
length = 1,2,3,4,5,6,7,8
price = 1,5,8,9,17,17,20
rodLength = 8
 */
public class rodCutting{
    //TC:O(n*totalRodLength)
    public static int pieceSell(int length[], int price[], int totalRodLength)
    {
        int n = length.length;
        int dp[][] = new int[n+1][totalRodLength+1];

        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<totalRodLength+1; j++)
            {
                int size = length[i-1];
                int cost = price[i-1];

                if(size <= j)
                {
                    int include = cost + dp[i][j-size];
                    int exclude = dp[i-1][j];
                    dp[i][j] = Math.max(include, exclude);

                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][totalRodLength];
    }

    public static void print(int dp[][])
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
        int []length = {1,2,3,4,5,6,7,8};
        int []price = {1,5,8,9,10,17,17,20};
        int rodLength = 8;

        System.err.println("Maximum value obtainable by selling the peices are:"+pieceSell(length,price,rodLength));
    }
}