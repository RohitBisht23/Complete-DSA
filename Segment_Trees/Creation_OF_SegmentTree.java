//Creating Segment Tree
public class Creation_OF_SegmentTree {
    static int STtree[];

    public static void init(int n)
    {
        STtree = new int[4*n];
    }
    
    public static int creatingST(int arr[],int i,int start,int end)
    {
        if(start == end)
        {
            STtree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;

        int left = creatingST(arr, 2 * i +1, start, mid);
        int right = creatingST(arr, 2* i +2, mid+1, end);


        STtree[i] = STtree[2*i+1] + STtree[2*i+2];
        return STtree[i];
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;

        init(n);

        creatingST(arr, 0, 0, n-1);

        for(int i=0; i<STtree.length; i++)
        {
            System.err.print(STtree[i] +" ");
        }
    }
}
