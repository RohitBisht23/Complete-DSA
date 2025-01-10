import java.util.Scanner;

//convertind decimal to binary
public class decimal_to_binary {
    public static int DecToBin(int n)
    {
        int binary = 0;
        int pow= 0;
        while(n>0)
        {
            int rem = n%2; //findin the remainder
            binary = binary+(rem*(int)(Math.pow(10,pow)));
            n = n/2;
            pow++;
        }
        return binary;
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the number number to convert it into binary:");
        int n = sc.nextInt();
        System.out.println("The binary of "+n+" is:"+DecToBin(n));
    }
}
