//Cleat bits between the range i and j
public class CLear_range_between {
    public static int ClearRangeBit(int n,int i,int j)
    {
        int a = (~0)<<j+1;
        int b = 1<<i -1;;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String args[])
    {
        System.out.println(ClearRangeBit(10,2,4));
    }
}
