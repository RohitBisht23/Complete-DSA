//Three sum

import java.util.*;

public class ThreeSum{

    //TC(O(n^3))
    /* 
    public static List<int[]> getTriplets(int arr[])
    {
        List<int[]> triplets = new ArrayList<>();
        HashSet<List<Integer>> unique = new HashSet<>();
        for(int i=0; i<arr.length; i++)
        {
            int elm1 = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                int elm2 = arr[j];
                for(int k=j+1; k<arr.length; k++)
                {
                    int elm3 = arr[k];

                   
                    if (elm1 + elm2 + elm3 == 0) {
                        int[] tempTriplet = {elm1, elm2, elm3};
                        Arrays.sort(tempTriplet);
                       
                        List<Integer> tripletList = new ArrayList<>();
                        for (int num : tempTriplet) {
                            tripletList.add(num);
                        }

                        if (unique.add(tripletList)) {
                            triplets.add(tempTriplet);
                        }

                    }
                } 
            } 
        }
        
        return triplets;
    }
    */

    //Better solution :TC->O(n^2) , SC->O(n^2)
    /* 
    public static List<int[]> getList(int arr[]) {
        HashSet<List<Integer>> set = new HashSet<>();
    
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int third = -(arr[i] + arr[j]);
                if (hashset.contains(third)) {
                    int temp[] = {arr[i], arr[j], third};
                    Arrays.sort(temp);
                    List<Integer> tripletList = new ArrayList<>();
                    for (int num : temp) {
                        tripletList.add(num);
                    }
                    set.add(tripletList);
                }
                hashset.add(arr[j]);
            }
        }
    
        List<int[]> triplets = new ArrayList<>();
        for (List<Integer> tripletList : set) {
            int[] triplet = new int[3];
            for (int i = 0; i < 3; i++) {
                triplet[i] = tripletList.get(i);
            }
            triplets.add(triplet);
        }
        return triplets;
    }
    */

    //Optimum solution below
    public static List<int[]>getList(int arr[])
    {
        Arrays.sort(arr);
        List<int[]>ans = new ArrayList<>();

        for(int i=0; i<arr.length; i++)
        {
            if(i > 0 && arr[i] == arr[i-1])
            {
                continue;
            } else {
                int j = i+1;
                int k = arr.length-1;

                while(j < k)
                {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum < 0)
                    {
                        j++;
                    } else if(sum > 0)
                    {
                        k--;
                    } else {
                        int[] temp = {arr[i],arr[j],arr[k]};
                        ans.add(temp);
                        j++;
                        k--;
                        while( j< k && arr[j] == arr[j-1])
                        {
                            j++;
                        } 

                        while(k > j && arr[k] == arr[k+1])
                        {
                            k--;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        List<int[]> result = getList(arr);
    
        for (int[] triplet : result) {
            System.out.print("[");
            for (int i = 0; i < triplet.length; i++) {
                System.out.print(triplet[i]);
                if (i < triplet.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}