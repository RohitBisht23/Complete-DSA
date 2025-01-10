/*Queue Reversal
ex:1,2,3,4,5
final = 5,4,3,2,1
*/
import java.util.*;
public class Queue_Reversal {
    public static void main(String[] args)
    {
        Queue<Integer>Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Stack<Integer>s = new Stack<>();
        while(!Q.isEmpty())
        {
            s.push(Q.remove());
        }
        while(!s.isEmpty())
        {
            Q.add(s.pop());
        }
        System.out.print(Q+" ");
    }

}
