/*
Subarray sum equal to k
ex: arr = {1,2,3},k = 3;
ans:2
 */
import java.util.*;
public class Subarray_sum_equal_k {
    public static void main(String[] args)
    {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer,Integer>map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        //if subarray sum or if whole array sum is equal to k for that
        map.put(0,1);


        for(int j=0; j<arr.length; j++)
        {
            sum += arr[j];
            if(map.containsKey(sum -k))
            {
                ans += map.get(sum -k);
            }
            map.put(sum , map.getOrDefault(sum,0)+1);
        }
        System.out.println("Subarray sum with equeal to k:"+ans);
    }
}
