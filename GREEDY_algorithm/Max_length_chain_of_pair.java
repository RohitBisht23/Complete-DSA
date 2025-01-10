/*
Max Length Chain of Pair
You are given n pairs of numbers. In every pair, the first number is always smaller than the 
second number. A pair(c,d) can come after pair(a,b) if b<c.
Find the longest chain which can be formed from a given set of pair
ex:
Pair=
(5,24)
(39,60)
(5,28)
(27,40)
(50,90)

And:3 i.e->(5,24)->(27,40)->(50,90)

 */

import java.util.*;

public class Max_length_chain_of_pair {
    public static void main(String[] args)
    {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        // Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
        // int newPair[][] = new int[pairs.length][3];

        // for(int i=0; i<pairs.length; i++)
        // {
        //     newPair[i][0] = i;
        //     newPair[i][1] = pairs[i][0];
        //     newPair[i][2] = pairs[i][1];
        // }
        
        //sorting
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));//sort based 'b'

        int maxChain = 1;
        
        int b = pairs[0][1];//chain end of first pair o.e 'b'
        for(int i=1; i<pairs.length; i++)
        {
            if(pairs[i][0] > b )
            {
                maxChain++;
                b = pairs[i][1];
            }
            
        }
       
        System.out.println("maximum length of chain length is:"+maxChain);

    }
}
