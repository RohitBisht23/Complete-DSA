/*
Union & Intersection
ex: arr1 = {7,3,9}
    arr2 = {6,3,9,2,9,4}

    And:union:6(7,3,9,6,4,2) (the element that is atleast once in any array)
        Intersection:2(3,9)(the elements that present in both array)
 */

import java.util.*;

import javax.swing.text.html.StyleSheet;

public class Union_InterSection {
    public static int getUnion(int arr1[],int arr2[])
    {
        HashSet<Integer>set = new HashSet<>();

        int i=0,j=0;
        while(i < arr1.length)
        {
            set.add(arr1[i]);
            i++; 
        }

        while(j < arr2.length)
        {
            set.add(arr2[j]);
            j++;
        }

        System.out.print(set+" ");
        return set.size();
    }

    public static int getIntersection(int arr1[], int arr2[])
    {
        HashSet<Integer> set = new HashSet<>();
        //Adding array 1 element into set
        for(int i=0; i<arr1.length; i++)
        {
            set.add(arr1[i]);
        }

        //comparing array2 element with set element if any element both contains then its a intersection element
        int count = 0;
        for(int i=0; i<arr2.length; i++)
        {
            if(set.contains(arr2[i]))
            {
                count++;
                int ele = arr2[i];
                set.remove(arr2[i]);
                System.out.print(ele+" ");
            }
        }
        return count;
    }
    public static void main(String [] args)
    {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println("Union:"+getUnion(arr1,arr2));
        System.out.println("Intersection:"+getIntersection(arr1,arr2));
    }
}
