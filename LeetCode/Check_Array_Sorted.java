//Check Array is sorted or not
public class Check_Array_Sorted {
    public static boolean SortedCheck(int arr[])
    {
        for(int i=1;i<arr.length; i++)
        {
            if(arr[i] >= arr[i-1])
            {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,2,2,3,4,5};
        System.out.println(SortedCheck(arr));
    }
}