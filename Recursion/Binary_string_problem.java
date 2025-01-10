//Binary string problem
/*
Print all binary string of size N without consecutive ones(1).
 */
public class Binary_string_problem {
    public static void BinaryString(int n,int lastPlace,String str)
    {
        //Base case
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        //work
        BinaryString(n-1, 0, str+"0");
        if(lastPlace == 0)
        {
            BinaryString(n-1, 1, str+"1");
            
        }

    }
    public static void main(String agrs[])
    {
        BinaryString(3, 0, "");
    }
}
