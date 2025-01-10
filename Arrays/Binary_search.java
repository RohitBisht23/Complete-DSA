import java.util.*;

//Binary search

public class Binary_search {
    public static int  Binarysearch(int arr[],int key)
    {
        int first = 0;
        int last = arr.length-1;
        while(first<=last)
        {
            int mid = (first+last)/2;
            if(arr[mid]==key)
            {
                return mid;
            }else if(arr[mid]>key)
            {
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return -1;
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of an array:");
        int n = sc.nextInt();
        System.out.print("Enter the finding key:");
        int key = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements for array:");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index = Binarysearch(arr,key);
        if(index == -1)
        {
            System.err.println("Not found");
        }else
        {
            System.out.print("found at index:"+index);
        }
    }
    
}
