//Second largest element in the array
public class Second_Largest_element 
{
    //Second smallest element
    public static int SecondSmallest(int arr[])
    {
        int smallest = arr[0];
        int SecSmallest = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                SecSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] != smallest && arr[i] < SecSmallest)
            {
                SecSmallest = arr[i];
            }
        }
        return SecSmallest;
    }
    //Second largest element
    public static int secondLargest(int arr[])
    {
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            // }else if(arr[i] < largest && arr[i] > secondLargest)
            // {
            //     secondLargest = arr[i];
            // }
        }
        return secondLargest;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,4,2,5,7,8,-2,9};
        int result = secondLargest(arr);
        System.out.println(result);
    }
}
