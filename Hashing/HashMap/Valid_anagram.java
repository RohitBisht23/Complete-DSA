/*
Valid Anagram
Given two strings 's' and 't', return true if 't' is an anagram of 's' and false otherwise.
A anagram is a word or phrase formed by rearrangind the letters of different word or phrase, typically
using all the original letters exactly once.
Ex: s = 'race' t= care
output : true
 */
import java.util.*;
public class Valid_anagram {

    //Brute force :TC:O(nlogn), SC:O(n)
    /* 
    public static boolean CheckAnagram(String s,String t)
    {
        
        if(s.length() != t.length())
        {
            return false;
        }

        //convert string to character array
        char sArray[] = s.toCharArray();
        char tArray[] = s.toCharArray();

        //sort both array
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        //compare both sorted character array
        return Arrays.equals(sArray, tArray);
    } */

    //Optimize-> TC:O(n), SC:O(n)
    public static boolean CheckAnagram(String s,String t)
    {
        HashMap<Character,Integer> Map = new HashMap<>();

        int i=0; 
        while(i != s.length())
        {
            char ch = s.charAt(i);
            Map.put(ch,Map.getOrDefault(ch, 0)+1);
            i++;
        }
 
        for(int j=0; j<t.length(); j++)
        {
            char ch = t.charAt(j);
            if(Map.get(ch) != null)
            {
                if(Map.get(ch) == 1)
                {
                    Map.remove(ch);
                }else{
                    Map.put(ch,Map.get(ch)-1);
                }
            }else{
                return false;
            }
        }

        return Map.isEmpty();
    }
    public static void main(String[] args)
    {
        String s = "race";
        String t = "care";
        System.out.println(CheckAnagram(s,t));
    }
}
