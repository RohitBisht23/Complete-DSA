/*  INVERSION COUNT (Hard) ->TC:O(NlogN),SC:O(N)
Question 3:Given an array of integers.Find the inversion count in the array.
Inversion count:For an array,inversion count indicates how far(or close) the
array is from being sorted.If the array is already sorted then the inversion
count is 0.If an array is sorted in the reverse order then the inversion count
is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i]>a[j] and i<j.
 */
public class Question3 {
    // Brute force:TC->O(n^2),SC:O(1)
    // public static int getInverseCount(int arr[])
    // {
    // int n = arr.length;
    // int inverseCount = 0;
    // for(int i=0; i<n-1; i++)
    // {
    // for(int j=i+1; j<n; j++)
    // {
    // if(arr[i] > arr[j])
    // {
    // inverseCount++;
    // }
    // }
    // }
    // return inverseCount;
    // }

    // OPTIMIZE :modified merge sort
    public static int getInverseCount(int arr[], int s, int e) {
        int inverseCount = 0;
        // Base case
        if (s >= e) {
            return 0;
        }

        int mid = s + (e - s) / 2;

        inverseCount += getInverseCount(arr, s, mid); // Left part of array
        inverseCount += getInverseCount(arr, mid + 1, e);// Right part of array

        inverseCount += merge(arr, s, mid, e);
        return inverseCount;

    }

    private static int merge(int arr[], int s, int mid, int e) {
        int temp[] = new int[e - s + 1];

        int i = s; // left array iterator
        int j = mid + 1;// Right array iterator;
        int k = 0;// temparory array iterator
        int inverseCount = 0;
        while (i <= mid && j <= e) 
        {
                if (arr[i] <= arr[j]) 
                {
                    temp[k] = arr[i];
                    i++;
                } else 
                {
                    inverseCount += (mid - i + 1);
                    temp[k] = arr[j];
                    // inverseCount += (mid - i + 1);
                    j++;
                }
                k++;
            
        }
        // While left half array elements are left to place
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // While right half array elements are left to place
        while (j <= e) {
            temp[k++] = arr[j++];
        }

        // Coping temparory array to original
        for (k = 0, i = s; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

        return inverseCount;
    }

    public static void main(String args[]) {
        int arr[] = {2,4,1,3,5};
        System.out.println(getInverseCount(arr, 0, arr.length - 1));
    }
}
