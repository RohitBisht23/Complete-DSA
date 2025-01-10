//Print subarray
public class Print_subarray{
    public static void printSub(int arr[])
    {   int total=0;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {   int start = i;
            for(int j=i;j<arr.length;j++)
            {  int end = j;
               for(int k=start;k<=end;k++)
               {
                System.out.print("["+arr[k]+"]");
                sum=sum+arr[k];
               }
               System.out.print("\nThe sum of the subarray:"+sum);
               total++;
               System.err.println();
               sum=0;
            }
            System.err.println();
        }
        System.err.print("The number of subarray:"+total);
    }
    public static void main(Creation_string args[])
    {
        int arr[]={2,4,6,8,10};
        printSub(arr);
    }
}