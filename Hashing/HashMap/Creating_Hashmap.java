//Creating hashmap operation

import java.util.HashMap;
public class Creating_Hashmap{
    public static void main(String[] args)
    {
        HashMap<String,Integer>hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonasia"));//REturn null as it does not present in hashMAp

        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonasia"));//FAlse bcuz does not exist

        //remmove - O(1)
        int val = hm.remove("China");
        System.out.println(hm);
        System.out.println(val);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.err.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}