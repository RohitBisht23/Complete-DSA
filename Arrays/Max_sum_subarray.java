// import java.util.*;

//maximam subarray sum 
public class Max_sum_subarray {
    public static void maximum_subarray_sum(int arr[]) {
        int maxi_sum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) { // subarray sum
                    currSum = currSum + arr[k];
                }
                System.out.println(currSum);
                if (maxi_sum < currSum) {
                    maxi_sum = currSum;
                }
            }

        }
        System.err.println("Maximum subarray sum is:" + maxi_sum);

    }

    public static void main(Creation_string args[]) {
        // int n;
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // int arr[] = new int[10];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int arr[] = {1,-2,6,-1,3};
        maximum_subarray_sum(arr);
    }

}
