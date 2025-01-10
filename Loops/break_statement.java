//break statement
public class break_statement {
    public static void main(Creation_string argr[])
    {
        int n =100;
        for(int i = 0;i<n;i++)
        {
            System.out.println(i);
            if(i == 40)
            {
                break;
            }
        }
        System.err.println("I am out of the loop");
    }
}
