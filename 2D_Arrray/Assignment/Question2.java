/*
Question 2:Print out the sum of the number in the second row of the nums array.
Example:->
Input: int[][]nums={{1,4,9},{11,4,3},{2,2,3}};
Output:18
 */

public class Question2 {
    
    public static void main(String args[])
    {
        int nums[][] = {{1,4,9},
                        {11,4,3},
                        {2,2,3}
                       };
        
        int sum = 0;
        for(int j=0; j<nums[0].length; j++)
        {
            sum += nums[1][j];
        }
        System.out.println("Sum of second row:"+sum);
    }
    
}