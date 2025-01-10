//Print fabonacci of n numbers
public class Problem5
{
    public static int Fabonacci(int n)
    {
        //Base case
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        int fibNminus1 = Fabonacci(n-1);
        int fibNminus2 = Fabonacci(n-2);
        int fibN = fibNminus1 + fibNminus2;
        return fibN;
    }
    public static void main(String agrs[])
    {
        int n = 25;
        int result = Fabonacci(n);
        System.out.println(result);
    }
}