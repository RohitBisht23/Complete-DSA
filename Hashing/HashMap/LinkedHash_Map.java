//LinkedHashMap
import java.util.*;
public class LinkedHash_Map {
    public static void main(String[] args)
    {
        LinkedHashMap <String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China",150);
        lhm.put("Us",50);

        System.out.println(lhm);
    }
}
