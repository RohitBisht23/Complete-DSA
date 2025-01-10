//reverse by count sort
public class reverse_count {
    public static void reverse(int arr[])
    {
        int longest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            longest = Math.max(longest, arr[i]);
        }

        int count[] = new int[longest +1];

        for(int i=0; i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        //sorting in reverse
        int j=0;
        for(int i=count.length-1; i>=0; i--)
        {
            while(count[i]>0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    //printing
    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {4,3,5,2,1};
        reverse(arr);
        print(arr);
    }
}
