/*    PAIR SUM 1
Find if any pair in a sorted ArrayList has a target sum
 */

import java.util.ArrayList;
import java.util.List;

public class Pair_sum1 {
    public static boolean PairSum(ArrayList<Integer>List,int target)
    {
        //BRUTE FORCE
       /*  for(int i=0; i<list.size(); i++)
        {
            for(int j=i+1; j<list.size(); j++)
            {
                if(List.get(i)+List.get(j) == target)
                {
                    return true;
                }
            }
        }
        return false;*/

        //OPTIMIZE:->By 2 pointer approach
        int Lp = 0;
        int Rp = List.size()-1;
        while(Lp <= Rp)
        {
            if(List.get(Lp)+List.get(Rp) == target )
            {
                return true;
            }else if(List.get(Lp)+List.get(Rp) < target){
                Lp++;
            }else{
                Rp--;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer>List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        int target = 5;
        System.out.print(PairSum(List,target));
    }
}
