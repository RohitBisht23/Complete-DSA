/*
Target sum subset
 */

public class Target_Sum_subset {
    //recursive code with tc->O(2^n)
/* 
    public static boolean subsetSum(int arr[],int target,int idx)
    {
        if(target == 0)
        {
            return true;
        }

        if(idx < 0)
        {
            return false;
        }

        if(arr[idx] <= target)
        {
            boolean include = subsetSum(arr, target-arr[idx], idx-1);
            boolean exclude = subsetSum(arr, target, idx-1);
            return include || exclude;
        } else{
            return subsetSum(arr, target, idx-1);
        }
        
    }
*/
    //memoization code
/* 
    public static boolean subsetSum(int arr[],int target,int idx,boolean dp[][])
    {
        if(target == 0)
        {
            return true;
        }

        if(idx < 0)
        {
            return false;
        }

        if(dp[idx][target])
        {
            return true;
        }

        if(arr[idx] <= target)
        {
            boolean include = subsetSum(arr, target - arr[idx], idx-1, dp);
            boolean exclude = subsetSum(arr, target, idx-1, dp);

            dp[idx][target] = include || exclude;
            return dp[idx][target];
        } else{
            return dp[idx][target] = subsetSum(arr, target, idx-1, dp);
        }
        
    }
*/

   //Tabulation ->TC:O(n*targetsum)
   public static boolean subSetSum(int arr[],int target)
   {
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][target+1];

        for(int i=0; i<n+1; i++)// 0th column initialie to true here
        {
            dp[i][0] = true;
        }

        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<target+1; j++)
            {
                int value = arr[i-1];

                if(value <= j && dp[i-1][j-value] == true)//valid or include
                {
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j] == true)
                {
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][target];
   }
    public static void main(String[] args)
    {
        int arr[] = {4,2,7,1,3};
        int target = 10;
        //recursive function calling statement
        // System.err.println("Is present subset sum :"+subsetSum(arr,target,arr.length-1));

        //Memoization function part
        /* 
        boolean dp[][] = new boolean[arr.length+1][target+1];
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                dp[i][j] = false;
            }
        }
        System.err.println("Is present subset sum :"+subsetSum(arr,target,arr.length-1,dp));
        */

        //Tabulation function part
        System.err.println("Is present:"+subSetSum(arr,target));
    }
}
