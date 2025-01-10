//LinkedHashSet
import java.util.LinkedHashSet;
public class LinkedListHashSet {
    public static void main(String[] args)
    {
        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        lSet.add("Delhi");
        lSet.add("Mumbai");
        lSet.add("Noida");
        lSet.add("Bengaluru");

        System.out.println(lSet);
    }
}
