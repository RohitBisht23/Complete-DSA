public class merge {
    public static void Sort(int arr[],int s,int e)
    {
        if(s >= e)
        {
            return;
        }
        int mid = (s+e)/2;
        Sort(arr,s,mid);
        Sort(arr,mid+1,e);

        Merge(arr,s,mid,e);
    }
    public static void Merge(int arr[],int s,int mid,int e)
    {
        int temp[] = new int[e-s+1];
        int i=s;
        int j =mid+1;
        int k = 0;

        while(i <= mid && j <= e)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<= mid)
        {
            arr[k++] = arr[i++];
        }
        while(j<= e)
        {
            temp[k++] = arr[j++];
        }

        for(k=0,i=s; k<temp.length; i++,k++)
        {
            arr[i] = temp[k];
        }
    }
    public static void Print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String agrs[])
    {
        int arr[] = {3,21,5,1,2,10,9};
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        Sort(arr,0,arr.length-1);
        System.out.println();

        Print(arr);
    }
}
