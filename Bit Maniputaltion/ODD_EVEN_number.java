//check odd or even number
public class ODD_EVEN_number {
    public static void ODDorEVEN(int n)
    {
        int bitmask = 1;
        if((n & bitmask)==0)
        {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String args[])
    {
        ODDorEVEN(3);
        ODDorEVEN(4);
        ODDorEVEN(8);
        ODDorEVEN(123);
    }
}
