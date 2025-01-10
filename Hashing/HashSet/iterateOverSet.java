
//Iterators 1->Iterator,  2->Enhanced for loop
import java.util.*;
public class iterateOverSet {
    public static void main(String [] args)
    {
        HashSet<String>cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Haldwani");
        cities.add("Nainital");
        cities.add("Haridwar");
        cities.add("Mumbai");

        //1->Using Iterator
        Iterator it = cities.iterator();
        while(it.hasNext())
        {
            System.err.println(it.next());
        }

        //2->Using Enhanced for loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
