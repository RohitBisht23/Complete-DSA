//Iterating in HashMap
import java.util.*;

public class Iterating {
    public static void main(String[] args)
    {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 6);
        hm.put("Indonesia", 5);

        //iterating by foreach loop
        Set<String>key = hm.keySet();
        System.out.println(key);//[China, US, Nepal, India]
        for (String k : key) {
            System.out.println("Key:" + k +", value:" + hm.get(k));
        }
        
        String r = "Rohit@3333";
        System.out.println(r.hashCode());
    }
}
