/*
Question 1:Apply Merge sort to sort an array of strings.(Assume that all the
characters in all the strings are in lowercase).
 */

public class Question1 {
    public static void Println(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MergeSort(String arr[], int Si, int Ei) {
        {
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
    }

    public static void Merge(String arr[], int S, int mid, int E) {
        String temp[] = new String[E - S + 1];
        int i = S; // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0; // Iterator for temp array

        while (i <= mid && j <= E) {
            if (arr[i].compareTo(arr[j]) < 0) {
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
        while (j <= E) {
            temp[k++] = arr[j++];
        }

        // Copy temp array to original arr
        for (k = 0, i = S; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String args[]) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        MergeSort(arr, 0, arr.length - 1);
        Println(arr);
    }
}
// public class Question1 {
// public static void Println(String arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void MergeSort(String arr[], int Si, int Ei) {
// // Base case
// if (Si >= Ei) {
// return;
// }

// // Work
// int mid = Si + (Ei - Si) / 2; // finding mid

// MergeSort(arr, Si, mid);// Left part

// MergeSort(arr, mid + 1, Ei);// Right part

// Merge(arr, Si, mid, Ei);
// }

// public static void Merge(String arr[], int S, int mid, int E) {
// String temp[] = new String[E - S + 1];
// int i = S; // Iterator for left part
// int j = mid + 1; // Iterator for right part
// int k = 0; // Iterator for temp array

// while (i <= mid && j <= E) {
// if (arr[i].compareTo(arr[j]) < 0) {
// temp[k] = arr[i];
// i++;
// } else {
// temp[k] = arr[j];
// j++;
// }
// k++;
// }

// // Left part
// while (i <= mid) {
// temp[k++] = arr[i++];
// }

// // Right part
// while (j <= E) {
// temp[k++] = arr[j++];
// }

// // Copy temp array to original arr
// for (k = 0, i = S; k < temp.length; k++, i++) {
// arr[i] = temp[k];
// }
// }

// public static void main(String args[]) {
// String arr[] = { "sun", "earth", "mars", "mercury" };
// MergeSort(arr, 0, arr.length - 1);
// Println(arr);
// }
// }
