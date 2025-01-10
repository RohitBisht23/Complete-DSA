/*
Query On Segment Tree
getting the range sum
 */
public class QueryON_ST {
    static int ST[];

    public static void init(int n)
    {
        ST = new int[n*4];
    }

    public static int builtST(int arr[],int i,int s,int e)
    {
        if(s == e)
        {
            ST[i] = arr[s];
            return arr[s];
        }

        int mid = (s + e)/2;

        builtST(arr, 2*i+1, s, mid);
        builtST(arr, 2*i+2, mid+1, e);

        ST[i] = ST[2*i+1] + ST[2*i+2];
        return ST[i];
    }

    public static int getSumUtil(int i,int Si, int Sj, int Qi, int Qj)
    {
        //case 1:Non Overlapping
        if(Qj <= Si || Qi >= Sj)
        {
            return 0; //Not include
        } 

        //Case 2:Complete overlapping
        else if(Si >= Qi && Sj <= Qj)
        {
            return ST[i]; //Include the Segment tree index value(node value)
        }

        //case 3: partial overlapping
        else{
            int mid = (Si + Sj)/2;
            int left = getSumUtil(2*i+1, Si, mid, Qi, Qj);
            int right = getSumUtil(2*i+2, mid+1, Sj, Qi, Qj);

            return left + right;
        }
    }

    public static int getSum(int arr[], int Qi, int Qj)
    {
        int n =arr.length;
        return getSumUtil(0, 0, n-1, Qi, Qj);
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        builtST(arr,0,0,n-1);

        for(int i=0; i<ST.length; i++)
        {
            System.err.print(ST[i]+" ");
        }

        int sum = getSum(arr, 2, 5);
        System.err.println("\nThe in this range is:"+sum);
    }
}
