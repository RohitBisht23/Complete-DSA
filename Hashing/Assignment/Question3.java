/*
Sort by frequency
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency
of a characters is the number of time it appears in the string.
Return the sorted string.If there are multiple answer, return any of them
 */
import java.util.*;
public class Question3 {
    // public static String SortFrequency(String str)
    // {
    //     TreeMap<Character,Integer>tmap = new TreeMap<>(Comparator.reverseOrder());

    //     for(int i=0; i<str.length(); i++)
    //     {
    //         tmap.put(str.charAt(i),tmap.getOrDefault(str.charAt(i),0)+1);
            
    //     }
        
    //     String result = "";
    //     for (char s : tmap.keySet()) {
    //         int value = tmap.get(s);
    //         for(int i=0; i<value; i++)
    //         {
    //             result += s;
    //         }
    //     }
    //     return result;
    // }
    public static String SortFrequency(String str)
    {
        TreeMap<Integer,Character> tmap = new TreeMap<>(Comparator.reverseOrder());

        int ky = 1;
        for(int i = 0; i < str.length(); i++)
        {
            if(!tmap.containsValue(str.charAt(i))){
                ky = 0;
                tmap.put(1, str.charAt(i));
            }else{
                ky = 1;
                tmap.put(ky+1,str.charAt(i));
                ky = ky +1;
            }
        }
        
        String result = "";
        for (Integer s : tmap.keySet()) {
            for(int i=0; i<getKey; i++)
            {
                result += tmap.get(s);
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        String str = "ccafsccsf";
        String ans = SortFrequency(str);
        System.out.println(ans);
    }
}
