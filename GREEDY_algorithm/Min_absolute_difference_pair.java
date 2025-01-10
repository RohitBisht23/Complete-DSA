/*
Min Absolute Difference Pairs
Given two arrays A and B of equal length n. Pair each element of array A to an element in aray B,
such that sum S of absolute differences of all pairs is minimum.
Ex:
A = [1,2,3]
B = [2,1,3]

Ans = 0
 */


import java.util.*;


public class Min_absolute_difference_pair {
    public static int AbsoluteDifferenceSum(int A[],int B[])
    {
        //Sort both array
        Arrays.sort(A);
        Arrays.sort(B);

        int min = 0;
        for(int i=0; i<A.length; i++)
        {
            min += Math.abs(A[i]-B[i]) ;
        }
        return min;
    }
    public static void main(String[] args)
    {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        int result = AbsoluteDifferenceSum(A,B);
        System.out.println("The min absolute differences pair is:"+result);
    }
}
