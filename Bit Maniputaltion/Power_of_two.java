//check if a number if power of two
public class Power_of_two {
    public static boolean isPowerOfTwo(int n)
    {
        return (n &(n-1)) == 0;
    }
    public static void main(String args[])
    {
        System.out.println(isPowerOfTwo(6));
    }
}