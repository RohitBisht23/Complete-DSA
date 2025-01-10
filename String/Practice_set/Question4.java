/*
Question:Determine of 2 strings are anagrams of rach other.
Anagram:if two string contains the same characters but in different orger, they
can said to be anagram.example rece and care
 */

import java.util.Arrays;

public class Question4 {
    public static void main(String args[])
    {
        String str1 = "earth";
        String str2 = "heart";

        /*convert the both into lower case so that we dont have to 
        chech for separately for lower case and uppercase*/
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //first check the both string length are same or not
        if(str1.length() == str2.length())
        {
            //convert string into char arrays
            char str1charArray[] = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            /*if the sorted array are same or identical then the array are
            anagram
             */
            boolean result = Arrays.equals(str1charArray,str2charArray);
            if(result) {
                System.out.println(str1 +" and "+ str2+" are anagram of each other");
            }else
            {
                System.out.println(str1 +" and "+ str2+" are not anagram of each other");

            }
        }else{
            System.out.println(str1 +" and "+ str2+" are not anagram of each other");

        }
    }
    
}
