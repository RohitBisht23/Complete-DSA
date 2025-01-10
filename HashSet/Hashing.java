//creating hashSet

import java.util.HashSet;
import java.util.Iterator;


public class Hashing {
    public static void main(String args[])
    {   //creating 
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        
        //search -contains
        if(set.contains(1))
        {
            System.err.println("Set contains 1");
        }
        if(!set.contains(6))
        {
            System.err.println("Set doesn't contains 6");

        }
        //Delete
        set.remove(1);
        //verifying
        if(!set.contains(1))
        {
            System.err.println("Set does not contain 1");
        }
        //size of the set
        System.err.println("size of the set is:"+set.size());
        
        //Printing all set elemenets (simply write name of the set)
        System.err.println("Set elements are:"+set);
        
        //Iterator of set(import first java.util.Iterator)
        Iterator it = set.iterator();
        //hasNext ; next;
        while(it.hasNext())
        {
            System.err.println(it.next());
        }
        
    }
    
}
