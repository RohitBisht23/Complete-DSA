/*
Find the maximum element 
 */



import java.util.*;

public class Find_maximum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n = sc.nextInt();

        ArrayList<Integer>list =new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            list.add(sc.nextInt());
        }
        int max = Integer.MIN_VALUE;
        //TC:O(n)
        for(int i=0; i<n; i++)
        {
            // if(list.get(i) > max)
            // {
            //     max = list.get(i);
            // } //OR
            max = Math.max(max, list.get(i));
        }

        System.out.print("the maximum element is:"+max);
    }
}
