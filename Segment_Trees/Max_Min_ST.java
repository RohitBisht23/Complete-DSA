/*
Max/Min Element Queries
Given an arr[], we have to answer few queries:
A->Output Max/Min for the subarray[i..j]
B->Update the ellement at idx

NOTE->Here we will create code by considering that we are creating for max element
 */
public class Max_Min_ST {

    //Constructint Segment tree
    static int ST[];

    public static void init(int n)
    {
        ST = new int[n*4];
    }

    public static void BuildST(int arr[],int i, int s,int e)
    {
        if(s == e)
        {
            ST[i] = arr[s];
            return;
        }

        int mid = (s + e)/2;
        BuildST(arr, 2*i+1, s, mid);
        BuildST(arr, 2*i+2, mid+1, e);

        ST[i] = Math.max(ST[2*i+1],ST[2*i+2]);
    }

    //Helper function to get the max value in the range
    public static int getMaxUtil(int i, int Si,int Sj,int Qi,int Qj)
    {
        //case 1:Non overlapping element
        if(Qj <= Si || Qi >= Sj)
        {
            return Integer.MIN_VALUE;
        }

        //case 2:Overlapped completely
        if(Qi <= Si && Qj >= Sj)
        {
            return ST[i];//return the node
        }

        //case 3:Partial overlapped
        else{
            int mid = Si + (Sj - Si)/2;
            int left = getMaxUtil(2*i+1, Si, mid, Qi, Qj);
            int right = getMaxUtil(2*i+2, mid+1, Sj, Qi, Qj);
            return Math.max(left, right);
        }
    }

    //A->Output MAx for the subarray[i....j]
    public static int getMax(int arr[], int Qi,int Qj)
    {
        int n = arr.length;
        return getMaxUtil(0,0,n-1,Qi,Qj);
    }


    //B->Updating the element
    public static void update(int arr[],int idx,int newVal)
    {
        arr[idx] = newVal;
        int n = arr.length;

        updateUtil(0,idx,0,n-1,newVal);
    }

    //Updating helper function
    public static void updateUtil(int i,int idx,int Si,int Sj,int newVal)
    {
        //case 1:Non overlap
        if(idx < Si || idx > Sj)
        {
            return;
        }

        if(Si == Sj)
        {
            ST[i] = newVal;
        }

        //Checking we left or right child also need to update or not
        if(Si != Sj)//this work for Non leaf
        {
            ST[i] = Math.max(ST[i], newVal);
            int mid = (Si + Sj)/2;
            updateUtil(2*i+1, idx, Si, mid, newVal);
            updateUtil(2*i+2, idx, mid +1, Sj, newVal);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);
        BuildST(arr, 0, 0, n-1);
        for(int i=0; i<ST.length; i++)
        {
            System.err.print(ST[i]+" ");
        }

        int Qi = 2;
        int Qj = 5;
        System.err.println("Get the maximum in the range is:"+getMax(arr, Qi, Qj));

        update(arr, 2, 2);
        System.err.println("Get the maximum elemetn in the range after updaing:"+getMax(arr, Qi, Qj));
        System.err.println("After updating the Sugment tree like:");
        for(int i=0; i<ST.length; i++)
        {
            System.err.print(ST[i]+" ");
        }
    }
}
