/*
Largest Subarray with sum 0
 */

import java.util.HashMap;

public class Largest_subarray_with_Sum0 {
    
    public static void main(String args[])
    {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;
        //Pair(sum,index)
        int count = 0;
        for(int j=0; j<arr.length; j++)
        {
            sum += arr[j];
            if(map.containsKey(sum))
            {
                len = Math.max(len, j - map.get(sum));
                count++;
            }else{
                map.put(sum, j);
            }
        }
        System.out.println("Largest sum with 0 is:"+len);
    }
}
