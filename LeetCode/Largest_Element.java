/*
Print the largest element in the given array
TC:O(n)
SC:O(1)
 */
public class Largest_Element {
    public static int LargestElement(int arr[])
    {
        int largest = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(largest < arr[i])
            {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String [] args)
    {
        int arr[] = {2,4,1,5,6};
        int result = LargestElement(arr);
        System.out.println(result);
    }
}
