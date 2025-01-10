
/*
Majority Element
Given an integer array of size n, find all elements that are appear more than [n/3].
Ex:nums[] = {1,3,2,5,1,3,1,5,1}
ans:1       
explanation:because n=9 so n/3 = 3 are 1 aprears more that n/3>1 times.
 */
import java.util.*;

public class Majority_element {
    public static void Majority(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
       
        for (int i = 0; i < arr.length; i++) {
           /* int num = arr[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {// No present
                map.put(num, 1);
            }*/  //or we can make above lines in one like below
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        /* 
        Set<Integer> Keyset = map.keySet();
        for (Integer key : Keyset) {
            if(map.get(key) > arr.length/3)
            {
                System.out.println(key);
            }
        }
        *///Also to not store the keySet() in in different ds we can directly run loop
        for (Integer key : map.keySet()) 
        {
            if(map.get(key) > arr.length/3)
            {
                System.out.println(key);
            }
            
        }

    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 1, 5, 1, 3, 2, 5, 1 };
        Majority(nums);
        
    }
}
