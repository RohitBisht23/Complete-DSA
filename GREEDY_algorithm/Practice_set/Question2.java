/*
Kth largest odd number in a given range
We ahve two variables L and R, indicating a range of integers from L to R inclusive, and a number k,
the task is to find Kth largest odd number. if K > number of odd numbers in the ranges L to R then 
return 0.
input: L=-3, R=3, K = 1
output:3
 */

public class Question2 {
    public static int KthOdd(int range[] , int k)
    {
        if(k <= 0)
        {
            return 0;
        }
        
        int  L = range[0];
        int R = range[1];

        if((R & 1) >0)
        {
            int count = (int)Math.ceil((R- L + 1)/2);
            if(k > count)
            {
                return 0;
            }else{
                return (R - 2 * k + 2);
            }
        }else{
            int count = (R - L + 1)/2;
            if(k > count)
            {
                return 0;
            }else
            {
                return (R - 2 * k + 1);
            }
        }
    }
    public static void main(String[] args)
    {
        int [] p = {-10,10};
        int k = 8;
        System.out.println(KthOdd(p,k));
    }
}
