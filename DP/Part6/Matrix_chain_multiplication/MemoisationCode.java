/*
Matrix chain Multiplication
 */
import java.util.*;
public class MemoisationCode {
    public static int memoisationMCM(int arr[], int i, int j,int dp[][])
    {
        if(i == j)
        {
            return 0;
        }

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++)
        {
            int cost1 = memoisationMCM(arr, i, k, dp);
            int cost2 = memoisationMCM(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;

            ans = Math.min(ans, finalCost);
            dp[i][j] = ans;
        }
        print(dp);
        return dp[i][j];

    }
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
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,3};
        int n = arr.length;

        int dp[][] = new int[n][n];
        
        for(int i=0; i<n; i++)
        {
            Arrays.fill(dp[i],-1);//filling -1 into 2D array row wise.
        }
        System.err.println("Mimimim cost of matrix multiplication is:"+memoisationMCM(arr,1,n-1,dp));
    }
}
