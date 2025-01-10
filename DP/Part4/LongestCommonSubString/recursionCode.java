/*
Longest Common Substring (variation of LCS)
A substring is a contiguous sequence of characters within a string
Example:
S1 = "ABCDE", S2 = "ABGCE"
ans:2 //AB
 */

public class recursionCode {
    public static int longestSubstring(String s1, String s2,int idx1, int  idx2,int count)
    {
        if(idx1 == s1.length()|| idx2 == s2.length())
        {
            return count;
        }

        if(s1.charAt(idx1) == s2.charAt(idx2))//same
        {
            
            count =  longestSubstring(s1, s2, idx1+1, idx2+1,count+1); //pick

        } else {
            int ans1 = longestSubstring(s1, s2, idx1+1, idx2,0);
            int ans2 = longestSubstring(s1, s2, idx1, idx2+1,0);
            count =  Math.max(ans1, ans2);
        }
        return count;
    }
    public static void main(String[] args)
    {
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";
        int n = str1.length();
        int m = str2.length();
        System.err.println("Longest common substring:"+longestSubstring(str1,str2,0,0,0));
    }
}
