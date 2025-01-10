/*Prefix sum also called maximum sumof subarray */
public class prefix_sum_subarray_Sum {
    public static void subarray_sum(int arr[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[]= new int[arr.length];
        prefix[0] = arr[0]; //first index sum is always same in prefix array
        //calculate prefix sum
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            int start = i;
            for(int j = i;j<arr.length;j++)
            {
                int end = j;
                currSum = start == 0?  prefix[end] : prefix[end] - prefix[start - 1];

                if(maxSum < currSum)
                {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum:"+maxSum);
    }
    public static void main(Creation_string args[])
    {
        int arr[]={1,-2,6,-1,3};
        subarray_sum(arr);
    }
    
}
