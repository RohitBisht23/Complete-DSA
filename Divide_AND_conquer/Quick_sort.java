//Quick sort algorithm
/*
Time complexity: O(n logn) Average case
                O(n^2) Worst case
Space complexity:O(1)
 */

public class Quick_sort {
    public static void PrintArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int arr[], int s, int e)
    {
        //Base case
        if(s >= e)
        {
            return;
        }
        int pIdx = partition(arr,s,e);
        quicksort(arr,s,pIdx -1);//Left part from pivot element
        quicksort(arr,pIdx+1,e);//Right part from pivot element
    }
    public static int partition(int arr[],int s,int e)
    {
        int pivot = arr[e];
        int i = s-1;
        for(int j=s;j<e;j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //placing pivot element to its right place
        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = pivot;
        return i; //i is the pIdx (pivot index)
    }
    public static void main(String[] args)
    {
        int arr[] = {6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);
        PrintArr(arr);
    }
}
