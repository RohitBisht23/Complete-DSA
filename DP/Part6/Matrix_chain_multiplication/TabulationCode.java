/*
Matrix chain Multiplication

 */
public class TabulationCode {
    public static int tabulationMCM(int arr[])
    {
        int n = arr.length;

        int dp[][] = new int[n][n];

        //below initialization not required in java
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                if(i == j)//single matrix
                {
                    dp[i][j] = 0;
                }
            }
        }

        //bottom up approach
        int ans = Integer.MAX_VALUE;
        for(int len = 2; len <= n-1; len++)//length for diagonal traversal
        {
            for(int i=1; i<=n-len; i++)//row
            {
                int j = i + len - 1;//column
                dp[i][j] = Integer.MAX_VALUE;

                for(int k=i; k<=j-1; k++)
                {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    int finalCost = cost1 + cost2 + cost3;

                    dp[i][j] =Math.min(finalCost, dp[i][j]);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
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
        int arr[] = {1,2,3,4,3};
        System.err.println("Minimum cost is of MCM is:"+tabulationMCM(arr));
    }
}
