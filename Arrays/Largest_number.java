//Largest number in array
import java.util.*;
public class Largest_number {
    public static int getlargest(int arr[])
    {   int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;//+infinity
        for(int i=0;i<arr.length;i++)
        {
            largest = Math.max(largest, arr[i]);
            smallest = Math.min(smallest,arr[i]);
        }
        System.err.println("The smallest element in array:"+smallest);
        return largest;
    }
    public static void main(Creation_string args[])
    {   
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.err.print("Enter the element of the array:");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        // int Largest = Integer.MIN_VALUE;
        System.err.println("The largest element in array:"+getlargest(arr));

    }
}
