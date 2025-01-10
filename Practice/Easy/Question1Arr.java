/*
 You are given an integer array nums containing distinct numbers, and you can perform the following
 operations until the array is empty.
 1->If the first element has the smallest value, remove it.
 2->Otherwise, put the first element at the end of the array.
Return an integer denoting the number of operations it takes to make nums empty.
ex: nums=[3,4,-1]
output:5
 */
public class Question1Arr {
    public static int operationArr(int nums[])
    {
        int operation = 0;
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] < nums[j]){
                    nums[j] = nums[j+1];
                }
            }
        }
    }
    public static void main(String [] args)
    {
        int nums[] = {3,4,-1};
        System.out.println("Number of opereations it takes:"+operationArr(nums));
    }
}
