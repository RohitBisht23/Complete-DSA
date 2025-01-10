//Print from n to 1 (Increasing order)
public class Problem2 {
    public static void PrintIncreasingOrder(int n)
    {
        //Base case
        if(n == 1)
        {
            System.out.print(n);
            return;
        }
        PrintIncreasingOrder(n-1);
        System.err.print(" "+n);
    }
    public static void main(String args[])
    {
        int n = 10;
        PrintIncreasingOrder(n);
    }
}


