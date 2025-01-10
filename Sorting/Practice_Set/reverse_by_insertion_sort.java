//reverse array through insertion sort

public class reverse_by_insertion_sort {
    public static void reverse(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    //printing
    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {4,3,5,2,1};
        reverse(arr);
        print(arr);
    }
}
