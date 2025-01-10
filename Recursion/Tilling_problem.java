//Problem 11:
/*
Tilling problem:Given an board of "2 X N" and tile of size "2 X 1", count the
number of ways to tile the given board using the 2 x 1 tiles.
(A tile can either be placed horizontally or vertically).
 */

import java.util.Scanner;

public class Tilling_problem {
    public static int TillingProblem(int n)//2 x n size board or floor
    {
        //Base case
        if(n ==0 || n == 1)
        {
            return 1;
        }
        //work
         //vertical choice
         int fnm1 = TillingProblem(n-1);

         //horizontal choice
         int fnm2 = TillingProblem(n-2);
        
         int totalWays = fnm1 + fnm2;
         return totalWays;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(TillingProblem(n));
    }
    
}
