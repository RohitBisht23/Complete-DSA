/*
Unbounded Knapsack(infinite number of times we can select single item)
 */
public class Unbounded_knapsack {
    public static int Tabulation(int val[],int wt[], int W)
    {
        int n = val.length;

        int[][] dp = new int[n+1][W+1];
        for(int i=0; i<dp.length; i++)
        {
            dp[i][0] = 0;
        }

        for(int i=0; i<dp[0].length; i++)
        {
            dp[0][i] = 0;
        }

        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<W+1; j++)
            {
                int value = val[i-1];
                int weight = wt[i-1];

                //valid condition
                if(weight <= j)
                {
                    int include = value + dp[i][j-weight];
                    int exclude = dp[i-1][j];

                    dp[i][j] = Math.max(include, exclude);

                } else { //invalid case
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
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
    public static void main(String []args)
    {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.err.println(Tabulation(val,wt,W));
    }
}
