//Two sum
//Time complexity: O(n)
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
   
    public  int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two elements sum up to the target.");
    }
    
    public static void main(String args[])
    {
        int arr[] = {3,2,4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] ans = twoSum.twoSum(arr, target);
        System.out.println(ans[0]+","+ans[1]);
    }
}
