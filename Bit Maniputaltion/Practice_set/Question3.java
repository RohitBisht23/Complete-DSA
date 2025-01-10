/*
Question3:Convert uppercase character to lowercase
 */
public class Question3 {
    public static void main(String args[])
    {
        //convert uppercase to lowercase
        for(char ch ='A'; ch<='Z'; ch++)
        {
            System.out.println((char)(ch|' '));
        }
    }
}
