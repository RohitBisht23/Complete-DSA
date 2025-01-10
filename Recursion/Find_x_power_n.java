//print x to the power n
public class Find_x_power_n
{
    // public static int power(int x,int n)
    // {
    //     if(n == 0)
    //     {
    //         return 1;
    //     }
    //     return x * power(x,n-1);
    // }

    //OPTIMIXE SOLUTION
    public static int OptimixePower(int a ,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int halfPower = OptimixePower(a, n/2);
        int halfPowerSQ = halfPower * halfPower;
        //for odd n
        if(n % 2 != 0)
        {
            halfPowerSQ = a * halfPowerSQ;
        }
        return halfPowerSQ;
    }
    public static void main(String []args)
    {
        int x = 2;
        // System.out.println(power(x,10));
        System.out.println(OptimixePower(x,10));

    }
}