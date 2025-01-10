/*
Question3:Write a program to find the length of string using recursion
 */
public class Question3 {
    public static int StringLength(String str)
    {
        //Base case
        if(str.length() == 0)
        {
            return 0;
        }
        return StringLength(str.substring(1)) +1;
    }
    public static void main(String[] args)
    {
        String str = "Rohit";
        System.out.println(StringLength(str));
    
    }
}
