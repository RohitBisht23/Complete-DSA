//Priority in java collection framework
import java.util.Comparator;
import java.util.PriorityQueue;
public class Priority_qIn_JCF{
    public static void main(String args[])
    {
        // PriorityQueue<Integer>pq = new PriorityQueue<>();
        //To get in reverse order just pass comparitor.reverseOrder() in constructor
        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(2);
        pq.add(1);
        pq.add(8);

        while(!pq.isEmpty())
        {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}