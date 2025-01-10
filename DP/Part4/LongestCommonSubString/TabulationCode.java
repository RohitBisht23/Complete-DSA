/*
Longest Common Substring (variation of LCS)
A substring is a contiguous sequence of characters within a string
Example:
S1 = "ABCDE", S2 = "ABGCE"
ans:2 //AB 
*/

public class TabulationCode {
    public static int longestCommonSubstring(String s1,String s2)
    {
        int n = s1.length();
        int m = s2.length();
        int ans = 0;
        

        int dp[][] = new int[n+1][m+1];

        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<m+1; j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                    
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        
        return ans;
    }
    public static void main(String[] args)
    {
        String str1 = "ABCDGH";
        String str2 = "ACDGER";
        System.err.println("Longest Common Substring:"+longestCommonSubstring(str1,str2));
    }
}
