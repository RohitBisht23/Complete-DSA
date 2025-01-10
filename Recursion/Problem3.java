//factorial of the number n
public class Problem3{
    public static int Factorial(int n)
    {
        //Base case
        if(n == 0)
        {
            return 1;
        }
        int fact = n * Factorial(n-1);
        return fact;
    }
    public static void main(String args[])
    {
        int  n = 6;
        int result = Factorial(n);
        System.out.println("Factorial of "+n+" is:"+result);
    }
}