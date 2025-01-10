/*
Find Itinerary for tickets
Tickect 1-> Chennai -> Bangaluru
Tickect 2-> Mumbai -> Delhi
Tickect 3-> Goe -> Chennai
Tickect 4->Delhi -> Goe
 */
import java.util.*;
public class ItineraryFORTickets {
    public static String getStart(HashMap<String ,String>tickets)
    {
        //Creating reverse map
        HashMap<String,String>revMap = new HashMap<>();

        for(String key:tickets.keySet())
        {
            revMap.put(tickets.get(key), key);
        }

        //compare both Hashmap keys
        for(String key:tickets.keySet())
        {
            if(!revMap.containsKey(key))
            {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        HashMap<String,String>tickets = new HashMap<>();
        tickets.put("Chennai","Bangaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        System.out.print(start);
        for(String key:tickets.keySet())
        {
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start);
        }
        System.out.print("->Journey end");
    }
}
