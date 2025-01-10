/*   PAIR SUM 2
Find if any pair in a sorted & rotated ArrayList has a target sum.
 */

import java.util.ArrayList;

public class Pair_sum2 {
    public static boolean Pairsum(ArrayList<Integer>list,int target)
    {
        //FInding breaking/pivot point
        int bp = -1;//bp->breaking point
        for(int i=0; i<list.size()-1; i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                bp = i;
            }
        }
        int Lp = bp+1;//Smallest
        int Rp = bp;//Largest

        while(Lp != Rp)
        {
            if(list.get(Lp)+list.get(Rp) == target)
            {
                return true;
            }
            if(list.get(Lp)+list.get(Rp) < target)
            {
                Lp = (Lp + 1) % list.size();
            }else{
                Rp = (list.size()+Rp - 1) % list.size();
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.print(Pairsum(list,target));
    }
}
