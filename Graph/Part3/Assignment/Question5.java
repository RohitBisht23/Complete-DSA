/*
Word Ladder
We have a dictionary, and two words 'start' and 'target'(both of same length).Find length of the 
smallest chain from 'start' to 'target' if it exists, such that adjacents words in the chain only
differ by onr character and each word in the chain is a valid word i.e; it exists in the dictionary.
It may be assumed that the 'targey' word exists in dictionary and length of all dictionary words is
same.
Ex:
input:Dictionary = {POON,PLEE,SAME,POIE,PLEA,PLIE,POIN},
start = TOON, target = PLEA

output:TOON - POON - POIN - POIE - PLIE - PLEE - PLEA
 */
import java.util.*;
public class Question5 {
    static class Pair{
        String first;
        int second;

        public Pair(String first,int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    public static int getMinChainLength(String dictionary[],String start,String t)
    {
        
        HashSet<String>set = new HashSet<>();
        for (String string : dictionary) {
            set.add(string);
        }

        Queue<Pair>q = new LinkedList<>();

        q.add(new Pair(start,1));

        set.remove(start);

        while(!q.isEmpty())
        {
            Pair curr = q.remove();
            if(curr.first.equals(t))
            {
                return curr.second;
            }

            for(int i=0; i<curr.first.length(); i++)
            {
                for(char ch = 'a'; ch <= 'z'; ch++)
                {
                    char replacedCharArray[] = curr.first.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    if(set.contains(replacedWord) == true)
                    {
                        set.remove(replacedWord);
                        q.add(new Pair(replacedWord, curr.second+1));
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        String dictionary[] = {"hot","dot","dog","lot","log","cog"};
        String start = "hit";
        String target = "cog";

        int result = getMinChainLength(dictionary,start,target);
        System.err.println(result);
    }
}
