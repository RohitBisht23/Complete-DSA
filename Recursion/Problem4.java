//Print sum of first n natural numbers
public class Problem4 {
    public static int Sum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        int sum = n + Sum(n-1);
        return sum;
    }
    public static void main(String args[])
    {
        int n = 10;
        System.out.println(Sum(n));
    }
}
