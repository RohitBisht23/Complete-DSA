 //Counting sort

public class count_sort {
   
    public static void Counting_Sort(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        //range finding for count array
        for(int i=0; i<arr.length; i++)
        {
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest +1];

        //updating count array
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }

        //sorting
        int j=0; //representing original array
        for(int i=0; i<count.length; i++)
        {
            while(count[i] >0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    //printing 
    public static void Print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(Creation_string args[])
    {
        int arr[] = {1,4,1,3,2,4,3,7};
        Counting_Sort(arr);
        Print(arr);
    }
}


