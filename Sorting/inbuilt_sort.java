//Inbuilt sort in very usefull sorting technique TC:O(n LOG n) < O(n^2)
import java.util.Arrays;
import java.util.Collections;
public class inbuilt_sort {
    public static void print(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(Creation_string args[])
    {
        // int arr[] = {5,1,4,3,2};
       // Arrays.sort(arr);//to sort whole array
        //Arrays.sort(arr,0,3); //sort element in the range

        //sort in reverse manner
        Integer arr[] = {5,1,4,3,2};
        // Arrays.sort(arr,Collections.reverseOrder());

        //for index to sort in range element
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        print(arr);
    }
}
