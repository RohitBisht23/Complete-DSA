/*
Swap two numbers
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Swap_two_numbers {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2)
    {
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
       
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n = sc.nextInt();

        System.out.println("Enter the first index:");
        int idx1  = sc.nextInt();

        System.out.println("Enter the second index:");
        int idx2  = sc.nextInt();

        ArrayList<Integer>list =new ArrayList<>();
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++)
        {
            list.add(sc.nextInt());
        }
        System.out.print(list);
        swap(list, idx1,idx2);
        System.out.print(list);
    }
}
