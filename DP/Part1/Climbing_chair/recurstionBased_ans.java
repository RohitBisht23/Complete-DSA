/*
Climbing Chair(recursion)
Count ways to reach nth stair. The person can climb either 1 stair or 2 stairs at a time
 */

public class recurstionBased_ans {
    public static int countWays(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(n < 0)
        {
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }
    public static void main(String[] args)
    {
        int n = 7;
        System.err.println("Total ways to reach stair "+n+" is:"+countWays(n));
    }
}
