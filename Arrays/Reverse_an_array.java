//Reversing array by swapping method (TC:O(N),SC:O(1))
public class Reverse_an_array {
    public static void reverse(int arr[])
    {
        int S = 0;
        int E = arr.length-1;
        while(S<E)
        {
            int temp = arr[E];
            arr[E] = arr[S];
            arr[S] = temp;
            S++;
            E--;
        }
    }
    public static void main(Creation_string args[])
    {
        int arr[]={2,4,6,8,10};
        reverse(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
    }
    
}
