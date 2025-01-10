//Heap sort
public class Heap_sort {

    private static void heapify(int arr[],int i,int n)
    {
        int left = 2*i +1;
        int right = 2*i +2;

        int maxidx = i;

        if(left < n && arr[left] > arr[maxidx])
        {
            maxidx = left;
        }

        if(right < arr.length && arr[right] > arr[maxidx])
        {
            maxidx = right;
        }

        if(maxidx != i)
        {
            //swap
            int temp = arr[i];
            arr[i] = arr[maxidx];
            arr[maxidx] = temp;

            heapify(arr,maxidx,n);
        }
    }
    public static void HeapSort(int arr[])
    {
        //Step 1->Build maxheap
        int n = arr.length;
        for(int i=n/2; i>=0; i--)
        {
            heapify(arr,i, n);
        }

        //step 2
        for(int i=n-1; i>0; i--)
        {
            //swap first idx with last idx
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp; 

            heapify(arr,0,i);//as i decrease by 1 so my length of arr also decrease the we pass i here
        }

    }
    public static void main(String[] args)
    {
        int arr[] = {1,3,2};
        HeapSort(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
