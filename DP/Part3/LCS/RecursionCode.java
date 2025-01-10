/*
Longest Common Subsequence
A subsequence of a string is a new string generated from a original string with some characters(can be none)
deleted without changing the relative order of the remaining characters
Example:
str1 = "abcde", str2 = "ace"
Ans = 3 //"ace"
 */

public class RecursionCode {
    public static int longestCommonSubsequence(String str1,String str2,int n,int m)
    {
        if(n == 0 || m == 0)
        {
            return 0;
        }

        //same
        if(str1.charAt(n-1) == str2.charAt(m-1))
        {
            return longestCommonSubsequence(str1, str2, n-1, m-1) +1;
        } else {
            int ans1 = longestCommonSubsequence(str1, str2, n-1, m);
            int ans2 = longestCommonSubsequence(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args)
    {
        String str1 = "abcegf";
        String str2 = "afceg";
        System.err.println("LCS:"+longestCommonSubsequence(str1,str2,str1.length(),str2.length()));
    }
}
