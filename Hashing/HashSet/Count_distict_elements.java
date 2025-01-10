/*
Count Distinct Element

 */
import java.util.*;
public class Count_distict_elements {
    //Brute force
    /* 
    public static void DistinctElement(int arr[])
    {
        int count = 0;
        ArrayList<Integer>result = new ArrayList<>();
            for(int j=0; j<arr.length; j++)
            {
                if(!result.contains(arr[j]))
                {
                    result.add(arr[j]);
                    count++;
                }
            }
        
        System.out.println(count);
    }*/
    public static void main(String args[])
    {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        //Optimize
        
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<arr.length; i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
