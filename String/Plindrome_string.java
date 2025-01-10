//Print the string is palindrome of not
//Time complexity:O(n)
import java.util.Scanner;

public class Plindrome_string {
    public static boolean isPalindrome(String str)
    {
        int first = 0;
        int last = str.length()-1;
        while(first <= last)
        {
            if(str.charAt(first) != str.charAt(last))
            {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(isPalindrome(str));
    }
    
}
