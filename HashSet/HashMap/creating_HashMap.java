//HASHMAP
import java.util.*;
public class creating_HashMap {
    public static void main(String args[])
    {
        //Country(key),Population(value)
        HashMap<String,Integer>map = new HashMap<>();
        //insertion
        map.put("India",120);
        map.put("U.S.", 30);
        map.put("China", 150);
        // System.out.println(map);
        map.put("China", 180);
        map.put("Pakistan",100);
        System.out.println(map);

        // //Search->1-.ContainsKey return T/F 2-.get
        // if(map.containsKey("China"))
        // {
        //     System.out.println("Key is present in the map");
        // }else{
        //     System.out.println("key doesn't present in the map");
        // }
        // System.out.println(map.get("China")); //print value otherwise Null
        // System.out.println(map.get("Indonesia"));

        //Iteration
        // for(Map.Entry<String,Integer>e:map.entrySet())
        // {
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());

        // }
        // //only to print key
        // Set<String>keys = map.keySet();
        // for(String key :keys)
        // {
        //     System.out.println(key+" "+map.get(key));
        // }
        //Delete
        map.remove("China");
        System.out.println(map);
    }
    
}
