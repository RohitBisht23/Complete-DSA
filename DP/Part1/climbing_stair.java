/*
Min Cost Climbing Stairs
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. 
Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
 */

import java.lang.reflect.Array;

public class climbing_stair {
    //Recursive solution TC:O(2^n)
    /* 
    static int calculateMin(int arr[], int i) {
        if (i >= arr.length) {
            return 0;
        }
        
        int oneStep = arr[i] + calculateMin(arr, i + 1);
        int twoSteps = arr[i] + calculateMin(arr, i + 2);
        
        return Math.min(oneStep, twoSteps);
    }
    */
    //Memoization
    /* 
    public static int calculateMin(int arr[],int i,int dp[])
    {
        if(i>= arr.length)
        {
            return 0;
        }

        if(dp[i] != 0)
        {
            return dp[i];
        }
        
        int oneStep = arr[i] + calculateMin(arr, i + 1, dp);
        int twoSteps = arr[i] + calculateMin(arr, i + 2, dp);

        dp[i] = Math.min(oneStep, twoSteps);
 
        return dp[i];
    }
    */

    //Tabulation
    public static int minCost(int arr[])
    {
        int n = arr.length;
        int dp[] = new int[n+1];

        for(int i=2; i<=n; i++)
        {
            dp[i] = Math.min(dp[i-1] + arr[i-1], dp[i-2]+arr[i-2]);
        }
        return dp[n];
    }
    // public static int minCost(int arr[]) {
    //     int dp[] = new int[arr.length];
    //     int startingStep0 = calculateMin(arr, 0,dp);
    //     int startingStep1 = calculateMin(arr, 1,dp);
        
    //     return Math.min(startingStep0, startingStep1);
    // }

    public static void main(String[] args)
    {
        int price[] = {1,100,1,1,1,100,1,1,100,1};
        System.err.println("Min cost is:"+minCost(price));
    }
}
