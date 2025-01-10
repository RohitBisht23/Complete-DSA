public class Tabulation {

    //printing dp arr
    public static void print(int dp[][])
    {
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                System.err.print(dp[i][j]+" ");
            }System.err.println();
        }
    }

    //TC->O(n*w)
    public static int knapsack(int val[],int wt[],int W)
    {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<dp.length; i++)//0th column
        {
           dp[i][0] = 0;
        }

        for(int i=0; i<dp[0].length; i++)//0th row
        {
            dp[0][i] = 0; 
        }

        for(int i=1; i<n+1; i++)//n time run
        {
            for(int j=1; j<W+1; j++)//w time runs
            {
                int v = val[i-1];//value of ith item
                int w = wt[i-1];//weight of ith item

                if(w <= j)
                {
                    //include
                    int incProfit = v + dp[i-1][j-w];

                    //exclude
                    int exProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit, exProfit);

                } else{//exclude
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        //printing the dp arr
        print(dp);
        return dp[n][W];
    }

    public static void main(String[] args)
    {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                dp[i][j] = -1;
            }
        }
        System.err.println(knapsack(val,wt,W));
    }
}
