/*
Longest increasing subsequence
example:
arr[] = {50,3,10,40,80}
Length of LIS = 4
 */

import java.util.*;

public class Longest_increasing_subsequence {

    public static int LCS(int arr1[],int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;

        int dp[][] = new int[n+1][m+1];

        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<m+1; j++)
            {
                if(arr1[i-1] == arr2[j-1])
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }


    public static int LIS(int arr[])
    {
        HashSet<Integer>set = new HashSet<>();

        for (Integer integer : arr) {
            set.add(integer);
        }

        int arr2[] = new int[set.size()]; //copy arr ->soerted unique arr

        int i=0;
        for (Integer num : set) {
            arr2[i] = num;
            i++;
        }

        Arrays.sort(arr2); //Sort array

        return LCS(arr,arr2);
    }
    public static void main(String[] args)
    {
        int arr[] = {50,3,10,7,40,50};
        System.err.println("Longest Increasing subsequence is:"+LIS(arr));
    }
}
