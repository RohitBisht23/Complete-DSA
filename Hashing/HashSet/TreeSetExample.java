//TreeSet
import java.util.*;
public class TreeSetExample {
    public static void main(String[] args)
    {
        TreeSet<Integer>ts = new TreeSet<>();
        ts.add(1);
        ts.add(0);
        ts.add(-3);
        ts.add(5);

        System.err.println(ts);
    }
}
