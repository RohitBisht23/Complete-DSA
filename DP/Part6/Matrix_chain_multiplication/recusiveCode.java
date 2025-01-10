/*
Matrix chain Multiplication

 */

public class recusiveCode {
    public static int mcmUtil(int arr[], int i, int j)
    {
        if(i == j)//single matrix case so cost 0
        {
            return 0;
        }

        int minCost = Integer.MAX_VALUE;//infinity

        for(int k=i; k<=j-1; k++)
        {
            int cost1 = mcmUtil(arr, i, k); //set1 ->resultant matrix sise:arr[i-1]xarr[k]
            int cost2 = mcmUtil(arr, k+1, j); //set2 ->resultant matrix sise:arr[k]xarr[j]
                       
                         //a        b       d
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;

            minCost = Math.min(minCost, finalCost);
        }
        return minCost;
    }
    public static int mcm(int arr[])
    {
        int i = 1; //stating point
        int n = arr.length;
        int j = n-1; //ending point
        return mcmUtil(arr , i , j);
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,3};
        System.err.println("Minimum cost of multiplication is:"+mcm(arr));
    }
}
