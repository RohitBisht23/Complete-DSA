//Update ith bit
public class Update_bit_operation{
     public static int CleatIthBit(int n,int i)
    {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
     public static int setIthBit(int n,int i)
    {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int Update(int n,int i,int newBit)
    {
        //Approach 1
        if(newBit == 0)
        {
            return CleatIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }

        //Approach 2
        // n = CleatIthBit(n,i);
        // int Bitmask = newBit<<i;
        // return n | Bitmask;
    }
    public static void main(String args[])
    {
        System.out.println(Update(10, 2, 1));
    }
}