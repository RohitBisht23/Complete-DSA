//convert binary into decimal
import java.util.*;
public class binary_into_decimal {
    public static int BinToDec(int n)
    {
        int dec = 0;
        int pow = 0;
        while(n>0)
        {
            int lastDigit = n%10;
            dec = dec +(lastDigit*(int)(Math.pow(2,pow)));
            pow++;
            n = n/10;
        }
        return dec;
    }
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int n = sc.nextInt();

        System.out.print("Decimal of "+n +":"+BinToDec(n));


    }
}
