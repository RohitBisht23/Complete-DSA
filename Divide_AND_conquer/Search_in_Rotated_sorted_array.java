/*SEARCH IN ROTATED SORTED ARRAY(medium level question)
Input:Sorted,rotated array with distinct numbers(in ascending order).It is 
rotated at a pivot point.Find the index of given element.

arr->[4,5,6,7,0,1,2]  target->0

Output:4
 */
public class Search_in_Rotated_sorted_array {
    public static int Search(int arr[],int target,int s,int e)
    {   //Base case
        if(s > e)
        {
            return -1;
        }
        //work
        int mid = s + (e-s)/2;

        //case found
        if(arr[mid] == target)
        {
            return mid;
        }

        //mid on L1
        if(arr[s]<=arr[mid])
        {   //case a:search on left part of L1
            if(arr[s] <= target && target <= arr[mid] )
            {
                return Search(arr,target,s,mid-1);
            }
            //case b:search on right part of L1
            else{
                return Search(arr,target,mid+1,e);
            }
        }

        //mid on L2
        else{
            //case c:search on right part of L2
            if(arr[mid] <= target && target <= arr[e])
            {
                return Search(arr,target,mid+1,e);
            }
            //case d:search on left part of L2
            else{
                return Search(arr,target,s,mid-1);
            }
        }
        
    }
    public static void main(String[] args)
    {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int targetIndex=Search(arr,target,0,arr.length-1);
        System.out.println(targetIndex);
    }   
}
