//Queue using java collection framework
//need to import the package
import java.util.LinkedList;
import java.util.Queue;
public class Queue_using_Java_collection_framework {
    public static void main(String[]args)
    {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        System.out.println(q.peek());
            
       
    }
}
