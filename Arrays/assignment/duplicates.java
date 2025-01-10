/* 
Question 1: Given an array nums, return true if any value appears at least
twice in the array,and return false if elements is distinct
*/

public class duplicates {
    public static boolean DuplicatesContains(int nums[])
    {
        for(int i =0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }  
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        // int nums[] = {1,2,3,1};
        int nums[] = {1,2,3,4};

        boolean Answer = DuplicatesContains(nums);
        System.out.println(Answer);
    }
    
}
