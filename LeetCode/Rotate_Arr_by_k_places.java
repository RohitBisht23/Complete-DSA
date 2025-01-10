/*
Rotate array by k places
ex:arr[]={1,2,3,4,5,6,7,8,9};
k = 3;
Output:{4,5,6,7,8,9,1,2,3}
 */
public class Rotate_Arr_by_k_places {
    public static void Kshift(int arr[],int k,int n)
    {   
        //BRUTE FORCE
    //     if(n == 0)
    //     {
    //         return ;
    //     }

    //     k = k % n;
        
    //     int temp[] = new int[k];
    //     for(int i=0;i<k;i++)
    //     {
    //         temp[i] = arr[i];
    //     }

    //     //Shifting rest element to the right by k places
    //     for(int i=k; i<n; i++)
    //     {
    //         arr[i-k] = arr[i]; 
    //     }

    //     //Placing the k element to the end  of the array
    //     int j = 0;
    //     for(int i=n - k; i< n; i++)
    //     {
    //         arr[i] = temp[j];
    //         j++;
    //     }
    // }

        //OPTIMIZE SOLUTION
        if(n == 0)
        {
            return;
        }
        k = k % n;

        //REverse k element first
        reverse(arr,0,k-1);

        //REverse rest k+1 to n-1 element 
        reverse(arr,k,n-1);

        //Now reverser the whole getted array
        reverse(arr,0,n-1);
    }


    public static void reverse(int arr[],int s,int e)
    {
        while(s <= e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
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
        int arr[] ={1,2,3,4,5,6,7};
        int k = 12;
        int n = arr.length;
        Kshift(arr, k,n);
        PrintArr(arr);

    }
}
