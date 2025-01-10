/*
String Conversion (variation of Edit distance question)
Convert string1 to string2 with only insertion and deletion
Print the number of deletions and insertion
String s1= "pear",   s2 = "sea";
ans:deletion : 2
    insertion : 1 
 */
public class String_Convertion {
    //TC:O(n*m)
    
    public static void operation(String s1,String s2)
    {
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];

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

        int addOperation = 0;
        int deleteOperation = 0;
        //Button up(tabulation)
        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<m+1; j++)
            {
                //same
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1];

                } else {           
                    addOperation = dp[i][j-1];
                    deleteOperation = dp[i-1][j];
                    dp[i][j] = Math.min(deleteOperation, addOperation);
                }
            }
        }
        System.err.println("Total add operations are:"+addOperation);
        System.err.println("Total delete operations are:"+deleteOperation);
    
    }
    

    /* Good and easy approach
    public static int getLCS(String s1,String s2)
    {
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<m+1; j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] +1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void operation(String s1,String s2)
    {
        int lcs = getLCS(s1,s2);
        int deleteOperations  = s1.length() - lcs;
        int addOperations = s2.length() - lcs;
        System.err.println("Delete operations count : "+ deleteOperations);
        System.err.println("Add operations count : "+ addOperations);
    }
    */
    public static void main(String[] args)
    {
        String str1 = "Pear";
        String str2 = "Sea";
        operation(str1, str2);
    }
}
