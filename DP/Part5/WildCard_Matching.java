/*
WildCard Matching
Given a text and a wildcard pattern, implement wildcard pattern matching algorithm that finds if 
wildcard pattern is matched with text. The matching should cover the entire text(not partial text).
The wildcard pattern can include the charaters '?' and '*'
'?' -> mathces any single character
'*' -> Matches any sequence of characters(including the empty sequence)

Example-> text:"baaabab"
patter = "*****ba*****ab"
output : true

Example-> text: "baaaba"
pattern = "a*ab"
output : false
 */
//Hard level problem

public class WildCard_Matching {
    //TC:O(n*m)
    public static boolean matchPattern(String str, String pattern)
    {
        int n = str.length();
        int m = pattern.length();

        boolean dp[][] = new boolean[n+1][m+1];

        //Initialization
        dp[0][0] = true;

        for(int i=1; i<n+1; i++)
        {
            dp[i][0] = false;
        }

        for(int j=1; j<m+1; j++)
        {
            if(pattern.charAt(j-1) == '*')
            {
                dp[0][j] = dp[0][j-2];
            }
        }

        //button up
        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<m+1; j++)
            {
                //case 1-> pattern last char either any aphabet of '?'
                if(str.charAt(i-1) == pattern.charAt(j-1) || pattern.charAt(j-1)=='?')
                {
                    dp[i][j] = dp[i-1][j-1];
                
                } //case when last char is '*'
                else if(pattern.charAt(j-1) == '*')
                {
                //case either ignore '*' else include if (might be in use in future)
                    dp[i][j] = dp[i][j-2] || dp[i-1][j];
                } else {
                    dp[i][j] = false;
                }  
            }
        }
        print(dp);
        return dp[n][m];
    }

    public static void print(boolean dp[][])
    {
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                System.err.print(dp[i][j] +" ");
            }
            System.err.println();
        }
    }
    public static void main(String[] args)
    {
        String str = "aab";
        String pattern = "c*a*b";
        System.err.println("Does wild card matches the pattern : "+matchPattern(str,pattern));
    }
}
