//Clear last I bits 
public class Clear_last_i_bits {
    public static int ClearLastIbits(int n,int i)
    {
        int bitmask = -1<<i; //~0<<i;
        return n & bitmask;
    }
    public static void main(String args[])
    {
        System.out.println(ClearLastIbits(15,2));
    }
}
