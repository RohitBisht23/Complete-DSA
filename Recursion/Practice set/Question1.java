/*
Question 1:For a given integer array of size N.You have to find all the 
occurences(indices) of the given  element(key) and print them.
Use recursive function to solve this problem
*/

public class Question1 {
    public static void AllOccurences(int arr[],int key,int i)
    {
        //base case
        if( i == arr.length)
        {
            return;
        }
        if(arr[i] == key)
        {
            System.out.print(i+" ");
        }
        AllOccurences(arr, key, i+1);
    }
    public static void main(String args[])
    {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        AllOccurences(arr,key,0);
    }
}
