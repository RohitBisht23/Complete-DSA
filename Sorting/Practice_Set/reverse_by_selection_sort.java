//reverse by selection sort

public class reverse_by_selection_sort {
    public static void reverse(int arr[])
    {
        for(int i=0 ;i<arr.length-1;i++)
        {
            int minPos = i;
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[minPos] < arr[j])
                {
                    minPos = j;
                }
            }
            //swapping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
