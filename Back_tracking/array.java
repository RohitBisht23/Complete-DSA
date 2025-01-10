/*
Question1:Given an empty array of size n, you have to traverse an array and
assign the value 1,2,3,4,5,6.... according to the index number.
as at index 0 the value should be 1 and at index 1 the value should be 2..
and once you hit the base case then decrease the value by 2 in every index.
 */
public class array{
    public static void changeArr(int arr[],int i,int val)
    {
        //Base case
        if(i == arr.length)
        {
            PrintArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;//Backtraking step
    }
    public static void PrintArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        changeArr(arr,0,1);
        PrintArr(arr);
    }
}