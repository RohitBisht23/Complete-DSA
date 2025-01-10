//Deque(Doble Ended Queue)
import java.util.*;
public class DeQue {
    public static void main(String [] args)
    {
        Deque<Integer>dq = new LinkedList<>();
        dq.addFirst(1);//1
        dq.addLast(2);//1,2
        System.out.println(dq);

        dq.removeFirst();//2
        dq.removeLast();//[]
        System.out.println(dq);
    }
}
