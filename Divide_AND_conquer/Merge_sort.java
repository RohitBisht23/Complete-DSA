/*Merge sort algorithm
Time complexity:NlogN
Space complexity:O(N)
*/
public class Merge_sort {
    // To print sorted arrray
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MergeSort(int arr[], int Si, int Ei) {
        // Base case
        if (Si >= Ei) {
            return;
        }

        // Work
        int mid = Si + (Ei - Si) / 2; // finding mid

        MergeSort(arr, Si, mid);// Left part

        MergeSort(arr, mid + 1, Ei);// Right part

        Merge(arr, Si, mid, Ei);
    }

    public static void Merge(int arr[], int S, int mid, int E) {
        int temp[] = new int[E - S + 1];
        int i = S; // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0; // Iterator for temp array

        while (i <= mid && j <= E) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }
        // Left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Right part
        while (j < E) {
            temp[k++] = arr[j++];
        }

        // Copy temp array to original arr
        for (k = 0, i = S; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        MergeSort(arr, 0, arr.length - 1);
        PrintArr(arr);
    }
}