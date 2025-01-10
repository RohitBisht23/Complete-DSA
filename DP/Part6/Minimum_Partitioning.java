/*(variation of 0-1 knapsack)
Minimum partitioning
Ex: arr[] = {1,6,11,5};
ans = 1
 */

public class Minimum_Partitioning {
    public static int getTotoalSum(int arr[],int n)
    {
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }
        return sum;
    }

    //TC:O(n*w)
    public static int Minimumdifference(int arr[])
    {
        int n = arr.length;
        int totalSum = getTotoalSum(arr,n);

        int W = totalSum/2; //set one capacity can be-> totalSum / 2

        int dp[][] = new int[n+1][W+1];

        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<W+1; j++)
            {
                int value = arr[i-1];
                int wt = arr[i-1];

                //valid
                if(wt <= j)
                {
                    //include
                    int include = value + dp[i-1][j-wt];

                    //exclude
                    int exclude = dp[i-1][j];
                    dp[i][j] = Math.max(include, exclude);
                } else {
                    //exclude
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];

        int sum2 = totalSum - sum1;

        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args)
    {
        int arr[] = {1,6,11,5};
        int ans = Minimumdifference(arr);
        System.err.println("Minimum difference is:"+ans);
    }
}
