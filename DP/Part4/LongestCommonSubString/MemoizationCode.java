/*
Longest Common Substring (variation of LCS)
A substring is a contiguous sequence of characters within a string
Example:
S1 = "ABCDE", S2 = "ABGCE"
ans:2 //AB
 */

public class MemoizationCode {
    public static int longestSubstring(String s1,String s2,int n,int m,int dp[][],int ans)
    {
        if(n == 0 || m == 0)
        {
            return ans;
        }

        if(dp[n][m] != -1)
        {
            return dp[n][m];
        }

        if(s1.charAt(n -1) == s2.charAt(m-1))
        {
            dp[n][m] = longestSubstring(s1, s2, n-1, m-1, dp,ans+1);
            return ans = Math.max(dp[n][m], ans);

        } else {
            return ans  = 0;
        }
    }
    public static void main(String[] args)
    {
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                dp[i][j] = -1;
            }
        }
        System.err.println("Longest common substring:"+longestSubstring(str1,str2,n,m,dp,0));
         for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                System.err.print(dp[i][j]+" ");
            }
            System.err.println();
        }
    }
}
