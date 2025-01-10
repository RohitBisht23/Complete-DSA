/*
Question 2:Given an array nums of size n,return the majority elements
Majority element:the element that appears mote than Ln/2_| times.
 */
public class Question2 {
    //Brute force:Time complexity:O(N^2)
    // public static int majorityElement(int nums[])
    // {
    //     int majorityCount = nums.length/2;

    //     for(int i=0; i<nums.length; i++)
    //     {
    //         int count = 0;
    //         for(int j=0; j<nums.length; j++)
    //         {
    //             if(nums[i] == nums[j])
    //             {
    //                 count += 1;
    //             }
    //         }
    //         if(count > majorityCount)
    //         {
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    //APPROACH:DIVIDE AND CONQUER
    private static int countInRange(int arr[],int num,int lo,int hi)
    {
        int count = 0;
        for(int i=lo; i<=hi; i++)
        {
            if(arr[i] == num)
            {
                count++;
            }
        }
        return count;
    }
    private static int majorityElementRec(int arr[],int lo,int hi)
    {
        //Base case
        if(lo == hi)
        {
            return arr[lo];
        }

        //Recurse on left and right halves of this slice
        int mid = lo + (hi - lo)/2;
        int left = majorityElementRec(arr, lo, mid);
        int right = majorityElementRec(arr, mid+1, hi);

        //if the two halves agree on the majority element,return it
        if(left == right)
        {
            return left;
        }

        //otherwise, count each element and return the "winner"
        int leftCount = countInRange(arr,left,lo,hi);
        int rightCount = countInRange(arr,right,lo,hi);

        return leftCount > rightCount? left:right;
    }

    public static int majorityElement(int arr[])
    {
        return majorityElementRec(arr,0,arr.length-1);
    }


    public static void main(String[] args)
    {
        int nums[] = {1,2,2,3};
        System.out.println(majorityElement(nums));
      
    }
}
