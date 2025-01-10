/*(variation of catalan's number)
Counting Trees
Find the number of all possible BSTs with given n nodes.
 */
public class Counting_BSTs {
    public static int countingBST(int nodes)
    {
        int dp[] = new int[nodes+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<nodes+1; i++)
        {
            for(int j=0; j<i; j++)
            {
                int leftSubstreeNodes = dp[j];
                int rightSubtreeNodes = dp[i-j-1];
                dp[i] += leftSubstreeNodes * rightSubtreeNodes;
                // dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[nodes];
    }
    public static void main(String args[])
    {
        int node = 4;
        System.err.println("Number of BST can be form :"+countingBST(node));
    }
}
