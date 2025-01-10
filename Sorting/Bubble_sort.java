//BUBBLE SORT  TC:O(n^2)
public class Bubble_sort {
    public static void Bubblesort(int arr[])
    { 
        for(int turn = 0; turn<arr.length-1; turn++)
        {
            for(int j=0; j<arr.length -1-turn; j++)
            {
                if(arr[j]> arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
        
    }
    //printing
     public static void print(int arr[])
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
     }
    
    public static void main(Creation_string args[])
    {
        int arr[] = {1,2,3,4,5};
        Bubblesort(arr);
        print(arr);
    }
}
