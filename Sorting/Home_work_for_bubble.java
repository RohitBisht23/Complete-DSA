/*
write a code for 1,2,3,4,5 using bubble sort in O(n) time complexity
 */

public class Home_work_for_bubble {
    public static void BubbleSort(int arr[])
    {   int n = arr.length;
        
        for(int i=0;i<n-1;i++)
        {   
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(Creation_string args[])
    {
        int arr[] = {1,2,3,4,5};
        BubbleSort(arr);
        print(arr);
    }
}
