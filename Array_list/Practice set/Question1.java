/*      MONOTONIC ARRAYLIST(easy)
An ArrayList is monotonic if it either monotone increasing or monotonce
decreasing.
An ArrayList nums is monotone increase if for all i<=j, nums.get(i)<=nums.get(j).
An ArrayList nums is monotone decrease if for all i<=j,nums.get(i)>=nums.get(j).
Given an integer Arraylist nums true if the given list is monotonic or false 
otherwise.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question1 {
    public static boolean isMonotonic(ArrayList<Integer>list)
    {
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<list.size()-1; i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                inc = false;
            }
            if(list.get(i) < list.get(i+1))
            {
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);
        System.out.println(isMonotonic(list));
    }
}
