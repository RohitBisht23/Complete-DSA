//Climbing stair problem using memoization(DP) optimize problem

import java.util.Arrays;

public class Memoization {
    public static int countWays(int n,int ways[])
    {
        if(n == 0)
        {
            return 1;
        } 
        if(n < 0)
        {
            return 0;
        }

        if(ways[n] != -1)//already calculated
        {
            return ways[n];
        }
        ways[n] = countWays(n-1, ways) + countWays(n-2,ways);
        return ways[n];
    }
    public static void main(String[] args)
    {
        int n = 7;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.err.println("Tatol ways are:"+countWays(n,ways));
    }
}
