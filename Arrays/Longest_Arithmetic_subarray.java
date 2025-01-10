import java.util.Scanner;

public class Longest_Arithmetic_subarray {
    public static int LogestArithmeticSum(int arr[])
    {   int n = arr.length;
        int ans = 2;
        int pd = arr[1]-arr[0];
        int j =2;
        int current = 2;
        while(j<n)
        {
            if(pd==arr[j]-arr[j-1])
            {
                current++;
            }else{
                pd = arr[j]-arr[j-1];
                current = 2;
            }
            ans = Math.max(ans,current);
            j++;
        }
        return ans;
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans = LogestArithmeticSum(arr);
        System.err.println("The logest arithmetic subarray is:"+ans);
    }
    
}
