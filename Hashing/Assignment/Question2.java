/*
Two sum
Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the 
same element twice.

You can return the answer in any order

ex: Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
import java.util.*;
public class Question2 {
    public static int[] twosum(int arr[],int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            int complement = target - arr[i];
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        int arr[] = {8,7,11,15,2};
        int target = 9;
        int result[] = twosum(arr,target);
        System.out.println(result[0]+" "+result[1]);
    }
}
