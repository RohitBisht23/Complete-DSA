/*
Update on segment tree
 */
public class UpdateOn_ST {
    static int ST[];

    public static void init(int n)
    {
        ST = new int[n*4];
    }

    //Built segment tree
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

    //range sum helper function
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

    //Get range sum here
    public static int getSum(int arr[], int Qi, int Qj)
    {
        int n =arr.length;
        return getSumUtil(0, 0, n-1, Qi, Qj);
    }

    //updating helper function->TC:O(log n)
    public static void updateUtil(int i,int Si,int Sj,int idx,int diff)
    {
        
    //case 1:does idx lies in the range(here idx is the index value where we updated, and i the node value)
        if(idx < Si || idx > Sj)//Non overlqapping
        {
            return;
        } 

        ST[i] += diff;
        //case 2:idx lies in the range
        if(Si != Sj)//Non leaf
        {
            int mid = (Si + Sj)/2;

            updateUtil(2*i+1, Si, mid, idx, diff);//left call
            updateUtil(2*i+2, mid+1, Sj, idx, diff);
        }
        
    }
    //Update on segment tree
    public static void update(int arr[],int idx,int newVal)
    {
        int diff = newVal - arr[idx]; //new value - previous value will be difference
        arr[idx] = newVal; //updated new value in array here

        int n = arr.length;
        updateUtil(0,0,n-1,idx,diff);//here i is which index we change the value
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

        //Update here
        update(arr, 2, 2);
        for(int i=0; i<ST.length; i++)
        {
            System.err.print(ST[i]+" ");
        }

        int sum2 = getSum(arr, 2, 5);
        System.err.println("\nThe in this range after updating is :"+sum2);
    }
}

