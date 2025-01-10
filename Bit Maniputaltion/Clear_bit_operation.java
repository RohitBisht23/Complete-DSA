//Clear the bit opration

public class Clear_bit_operation {
    //Approach 1:using XOR operator
    // public static int CleatIthBit(int n,int i)
    // {
    //     int bitmask = 1<<i;
    //     return n ^ bitmask;
    // }


    //Approach 2: using the combination of NOT and AND operator
    public static int CleatIthBit(int n,int i)
    {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String args[])
    {
        System.out.println(CleatIthBit(10,1));
    }
}
/*
NOTE:In both appraoch the Second one is good in time complexity but these
can varies according to compiler and hardware. But mostly approach second takes 
less time because in some cases the XOR operation may required addition
operation to toggle the bit.
 */

