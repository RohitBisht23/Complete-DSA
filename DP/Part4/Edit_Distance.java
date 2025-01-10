/*
Edit Distance  (vatiation of LCString)
Given two strings Word1 and Word2, return the minimum number of operations required to convert word1
to word2.
You have the following three operations permitted on a word.
1->Insert a character
2->Delete a character
3->Replace a character

Example->   word1 = 'intention', word3 = 'execution'
intention -> inention  (remove 't')                     operation:1
inention  -> enention  (replace 'i' with 'e')           operation:2
enention  -> exention  (replace 'n' with 'x')           operation:3
exention  -> exection  (replace 'n' with 'c')           operation:4
exection  -> execution (insert 'u')                     operation:5

Ans:5
 */
public class Edit_Distance {

    //Recution Code ->TC->O(3^n+m)
    /* 
    public static int convertWordOne(String str1,String str2,int n,int m)
    {
        if(n == 0 )
        {
            return m;
        }

        if(m == 0)
        {
            return n;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1))
        {
            return convertWordOne(str1, str2, n-1, m-1) ;

        } else {
            //choices 1->add
            int addCase = convertWordOne(str1, str2, n, m-1) +1;

            //2->delete
            int deleteCase = convertWordOne(str1, str2, n-1, m) +1;

            //3->replacemjujn 
            int replaceCase = convertWordOne(str1, str2, n-1, m-1) +1;

            return Math.min(Math.min(addCase,deleteCase),replaceCase);
        }

    }

    */

    //TC:O(n*m)
    public static int convertWordOne(String s1,String s2)
    {
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];
        StringBuilder s = new StringBuilder();

        //Initialization
        for(int i=0; i<n+1; i++)
        {
            for(int j=0; j<m+1; j++)
            {
                if(i == 0)
                {
                    dp[i][j] = j;
                }

                if(j == 0){
                    dp[i][j] = i;
                }
            }
        }

        //Button up(tabulation)
        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<m+1; j++)
            {
                //same
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1];

                } else {                //Add              //Delete    //replace
                    dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1])) +1;
                    s.append(s1.charAt(i-1));
                }
            }
        }
        System.err.println(s);
        print(dp);
        return dp[n][m];
    }

    public static void print(int dp[][])
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
    public static void main(String args[])
    {
        String str1 = "ABC";
        String str2 = "SBD";
        int n = str1.length();
        int m = str2.length();
        // System.err.println("Minimum operation to convert str 1 into 2 are :"+convertWordOne(str1,str2,n,m));
        System.err.println("Minimum operation to convert str 1 into 2 are :"+convertWordOne(str1,str2));
    }
}
