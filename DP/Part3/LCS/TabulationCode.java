/*
Longest Common Subsequence
 */
public class TabulationCode {
    public static int lcs(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];
        StringBuilder ans = new StringBuilder("");

        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<m+1; j++)
            {
                if(str1.charAt(i-1) == str2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans.append(str1.charAt(i-1));
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        System.err.println(ans);
        return dp[n][m];
    }
    public static void main(String[] args)
    {
        String str1 = "bl";
        String str2 = "yby";
        System.err.println("LCS:"+lcs(str1,str2));
    }
}
