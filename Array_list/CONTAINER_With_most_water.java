
/* Container with most water 
for given lines on x-axis, use 2 lines to form a container such that it holds
maximum water
 */
import java.util.ArrayList;

public class CONTAINER_With_most_water {
    public static int Max_water(ArrayList<Integer> list) {
        //BRUTE FORCE APPROACH
        /*  
        int area = 0;
        int result = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int width = j - i;
                int minLine = Math.min(list.get(i), list.get(j));
                area = width * minLine;
                if (result < area) {
                    result = area;
                }
            }
        }

        return result;*/

        //OPTIMIZE APPROACH(Using two pointer approach),TC:O(n)
        int maxWater = 0;
        int start = 0; 
        int end = list.size()-1;
        while(start < end)
        {
            int width = end - start;
            int MinHeight = Math.min(list.get(start), list.get(end));
            int water = width * MinHeight;
            if(water > maxWater)
            {
                maxWater = water;
            }
            if(list.get(start) < list.get(end))
            {
                start++;
            }else{
                end--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int result = Max_water(list);
        System.out.println("Maximum water:" + result);
    }
}
