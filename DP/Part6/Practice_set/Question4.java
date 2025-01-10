/*
Longest Increasing Path in Matrix
We have a matrix of N rows and M columns.From M[i][j], we can moce to M[i+1][j] if M[i+1][j] > M[i][j]
or we can move to M[i][j+1] if M[i][j+1] > M[i][j]. The task is to print the longest path length
if we start from (0,0).
Example:  N=4 and M=4;
M[][] = {
        {1,2,3,4},
        {2,2,3,4},
        {3,2,3,4},
        {4,5,6,7},
        }

Output : Longest path is 1 2 3 4 5 6 7
 */

public class Question4 {
    public static int getLengthUtil(int mt[][],int n,int m,int x,int y,int dp[][])
    {

            if (dp[x][y] < 0) {
                int result = 1;  // Initialize result to 1 for the current cell.
        
                if (x + 1 < n && mt[x][y] < mt[x + 1][y]) {
                    result = Math.max(result, 1 + getLengthUtil(mt, n, m, x + 1, y, dp));
                }
        
                if (y + 1 < m && mt[x][y] < mt[x][y + 1]) {
                    result = Math.max(result, 1 + getLengthUtil(mt, n, m, x, y + 1, dp));
                }
        
                dp[x][y] = result;
            }
        return dp[x][y];
    }

    public static int getLength(int mt[][],int n, int m)
    {
        int dp[][] = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                dp[i][j] = -1;
            }
        }

        return getLengthUtil(mt,n,m,0,0,dp);
    }
    public static void main(String[] args)
    {
        int n = 4;
        int m = 4;
        int matrix[][] = {
        {1,2,3,4},
        {2,2,3,4},
        {3,2,3,4},
        {4,5,6,7},
        };

        System.err.println("Lomgest path is :"+getLength(matrix,n,m));
    }
}
