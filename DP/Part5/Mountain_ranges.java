/*
Mountain Ranges
Mountain & Valleys 
Condition-> at any moment the number of down strokes cannot be more than number of up stroke

 */
public class Mountain_ranges {
    public static int mountainRange(int pairs)
    {
        int dp[] = new int[pairs+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<pairs+1; i++)
        {
            for(int j=0; j<i; j++)
            {
                int insidePair = dp[j];
                int outsidePair = dp[i-j-1];
                dp[i] += insidePair * outsidePair;
                //dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[pairs];
    }
    public static void main(String[] args)
    {
        int n = 5;
        System.err.println("Tatol mountain ranges are :"+mountainRange(n));
    }
}
