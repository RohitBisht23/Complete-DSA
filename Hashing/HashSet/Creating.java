//Creating HashSet

import java.util.HashSet;
public class Creating {
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(3);

        System.out.println(set);

        set.remove(2);
       
        if(set.contains(2))
        {
            System.out.println("Set contains 2");
        }

        if(set.contains(4))
        {
            System.out.println("Set container 4");
        }

        System.err.println("Set size is:"+set.size());
        set.clear();
        System.out.println(set);

        System.out.println(set.isEmpty());

       

    }
}
