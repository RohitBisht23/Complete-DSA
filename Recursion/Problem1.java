//Print numbers from n to 1

import java.util.Scanner;

public class Problem1 {
    public static void RecursoveProblem(int n)
    {
        //base case
        if(n == 1)
        {
            System.out.print(n);
            return ;
        }
        System.out.print(n+" ");
        RecursoveProblem(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RecursoveProblem(n);
    }
}
