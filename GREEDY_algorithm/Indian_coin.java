
/*
Indian Coins
We are given an infinite suppty of denominations [1,2,5,10,20,50,100,500,2000].
find the min no. of coins/notes to make changes for a value
ex:
v = 121
(its min changes): 100,20,1 = 100+20+1 = 121
ans = 3
 */
import java.util.*;

public class Indian_coin {
    public static void main(String[] args)
    {
        Integer currency[] = {1,2,5,10,20,50,100,500,2000};

        int val = 590;
        
        int noteCount = 0;
        Arrays.sort(currency,Comparator.reverseOrder());

        ArrayList<Integer> Note = new ArrayList<>();

        for(int i=0; i<currency.length; i++)
        {
            if(currency[i] < val)
            {
                while(currency[i] <= val)
                {
                    noteCount++;
                    Note.add(currency[i]);
                    val -= currency[i];
                }
            }
        }
        System.out.println(Note+"\n"+noteCount);

    }

}
