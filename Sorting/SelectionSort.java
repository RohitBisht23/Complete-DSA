//Selection sort  TC:O(n^2)

public class SelectionSort {
    public static void selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i = 0; i<=n-2; i++)
        {
            int minPos = i;
            for(int j = i+1; j<=n-1; j++)
            {
                if(arr[minPos] > arr[j])
                {
                    minPos = j;
                }
            }
            //swap - reducing no. swapping compare to bubble sort
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void display(int arr[])
    {
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(Creation_string args[])
    {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        display(arr);
    }
}
