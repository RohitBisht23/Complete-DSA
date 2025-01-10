/*
Left rotate array by one place
ex:arr->1,2,3,4,5
output:2,3,4,5,1
all are sifted left and 1 is rotated and placed at the end
 */
public class Left_rotate_Array_by_one {
    public static void PrintArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.err.print(arr[i]+" ");
        }
    }
    public static void leftRotate(int arr[])
    {
        int curr = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = curr;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        leftRotate(arr);
        PrintArr(arr);
    }
}
